import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path = args[0];
        String text = getText(path);
        antlr.macaroniLexer macaroniLexer = new antlr.macaroniLexer(CharStreams.fromString(text));
        CommonTokenStream commonTokenStream = new CommonTokenStream(macaroniLexer);
        antlr.macaroniParser macaroniParser = new antlr.macaroniParser(commonTokenStream);
        MacaroniVisitor macaroniVisitor = new MacaroniVisitor();
        MacaroniError macaroniErrorListener = new MacaroniError();
        macaroniParser.removeErrorListeners();
        macaroniParser.addErrorListener(macaroniErrorListener);
        ParseTree parseTree = macaroniParser.program();
        int n=macaroniErrorListener.syntaxErrorList.size();
        if(macaroniErrorListener.syntaxErrorList.size() == 0){
            macaroniVisitor.visit(parseTree);
            macaroniVisitor.compilerOutcome();
        }
        else{
            System.out.println("List of Syntax Errors");
            for(int i=0;i<n;i++){
                System.out.println(macaroniErrorListener.syntaxErrorList.get(i));
            }
        }
    }

    public static String getText(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder lines = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null)
                lines.append(line).append("\n ");
            return lines.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
