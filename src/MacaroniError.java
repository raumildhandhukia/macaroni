import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class MacaroniError extends BaseErrorListener {

    public final List<String> syntaxErrorList = new ArrayList<>();

    @Override public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                      int charPositionInLine, String msg, RecognitionException e) {
        String position = "\t[" + line + ":" + charPositionInLine + "] ";
        syntaxErrorList.add("\033[31m"+ position +  msg + "\033[0m");
    }

}
