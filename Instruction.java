import java.util.Arrays;

/**
 *
 */
class Instruction {
    private String instructionStr;
    private Enums.Opcode op;
    private Operand[] operands;

    String getInstructionStr() {
        return instructionStr;
    }

    void setInstructionStr(String instructionStr) {
        this.instructionStr = instructionStr;
    }

    public Enums.Opcode getOp() {
        return op;
    }

    void setOp(Enums.Opcode op) {
        this.op = op;
    }

    public Operand[] getOperands() {
        return operands;
    }

    void setOperands(Operand[] operands) {
        this.operands = operands;
    }

    //@Override
    public String toString() {
        return "Instruction{" +
                "instructionStr='" + instructionStr + '\'' +
                ", op=" + op +
                ", operands=" + Arrays.toString(operands) +
                '}';
    }
}
