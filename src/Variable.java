import java.util.Objects;

public class Variable {
    public Object variableValue;

    public Variable(String type) {
        if (Objects.equals(type, "int")){
            variableValue = 0;
        } else if (Objects.equals(type, "str")) {
            variableValue = "";
        } else if (Objects.equals(type, "bool")) {
            variableValue = false;
        } else {
            System.out.println("Invalid Type");
        }
    }

    private String getMacaroniClass(String javaClass){
        return switch (javaClass) {
            case "class java.lang.String" -> "str";
            case "class java.lang.Integer" -> "int";
            case "class java.lang.Boolean" -> "bool";
            default -> "";
        };
    }

    public void setVariableValue(Object value) throws Exception{
        if (variableValue.getClass().equals(value.getClass())) {
            this.variableValue = value;
        }
        else throw new Exception("Assignment failed. Cannot assign " + getMacaroniClass(value.getClass().toString()) + " to " + getMacaroniClass(variableValue.getClass().toString()));
    }
}
