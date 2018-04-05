/**
 * Created by priyanka on 11/3/16.
 */
class Operand {

    private Enums.OperandType operandType;
    private String operandValue;

    public Enums.OperandType getOperandType() {
        return operandType;
    }

    void setOperandType(Enums.OperandType operandType) {
        this.operandType = operandType;
    }

    public String getOperandValue() {
        return operandValue;
    }

    void setOperandValue(String operandValue) {
        this.operandValue = operandValue;
    }

    //@Override
    public String toString() {
        return "Operand{" +
                "operandType=" + operandType +
                ", operandValue='" + operandValue + '\'' +
                '}';
    }
}
