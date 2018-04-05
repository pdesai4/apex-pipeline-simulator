/**
 *
 */
public class Simulator {

    public static void main(String[] args) {
        Initialize initialize = new Initialize();
        initialize.setPath(args[0]);
        initialize.initialize();

        Instruction i = new Instruction();
        i.setInstructionStr("MOVC R2, #40");
        System.out.println(i);
        System.out.println(decode(i));
    }

    private static Instruction decode(Instruction i) {

        Enums.Opcode op = Enums.Opcode.HALT;
        Operand[] operands = null;

        String instr = i.getInstructionStr();

        String[] tokens = instr.split(" ");

        if (tokens[0].contains("ADD")) {
            op = Enums.Opcode.ADD;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            Operand operand3 = opEdit(tokens[3]);
            operands = new Operand[]{operand1, operand2, operand3};
        } else if (tokens[0].contains("SUB")) {
            op = Enums.Opcode.SUB;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            Operand operand3 = opEdit(tokens[3]);
            operands = new Operand[]{operand1, operand2, operand3};
        } else if (tokens[0].contains("MOVC")) {
            op = Enums.Opcode.MOVC;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            operands = new Operand[]{operand1, operand2};
        } else if (tokens[0].contains("AND")) {
            op = Enums.Opcode.AND;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            operands = new Operand[]{operand1, operand2};
        } else if (tokens[0].contains("OR")) {
            op = Enums.Opcode.OR;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            operands = new Operand[]{operand1, operand2};
        } else if (tokens[0].contains("EX-OR")) {
            op = Enums.Opcode.EX_OR;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            operands = new Operand[]{operand1, operand2};
        } else if (tokens[0].contains("BAL")) {
            op = Enums.Opcode.BAL;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            operands = new Operand[]{operand1, operand2};
        } else if (tokens[0].contains("JUMP")) {
            op = Enums.Opcode.JUMP;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            operands = new Operand[]{operand1, operand2};
        } else if (tokens[0].contains("BZ")) {
            op = Enums.Opcode.BZ;
            Operand operand1 = opEdit(tokens[1]);
            operands = new Operand[]{operand1};
        } else if (tokens[0].contains("BNZ")) {
            op = Enums.Opcode.BNZ;
            Operand operand1 = opEdit(tokens[1]);
            operands = new Operand[]{operand1};
        } else if (tokens[0].contains("LOAD")) {
            op = Enums.Opcode.LOAD;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            Operand operand3 = opEdit(tokens[3]);
            operands = new Operand[]{operand1, operand2, operand3};
        } else if (tokens[0].contains("STORE")) {
            op = Enums.Opcode.STORE;
            Operand operand1 = opEdit(tokens[1]);
            Operand operand2 = opEdit(tokens[2]);
            Operand operand3 = opEdit(tokens[3]);
            operands = new Operand[]{operand1, operand2, operand3};
        }

        i.setOp(op);
        i.setOperands(operands);
        return i;
    }

    private static Operand opEdit(String token) {
        token = token.replace(",", "");
        Operand op1 = new Operand();
        if (token.contains("#")) {
            op1.setOperandType(Enums.OperandType.LITERAL);
            op1.setOperandValue(token);
        } else {
            op1.setOperandType(Enums.OperandType.REGISTER);
            op1.setOperandValue(token);
        }
        return op1;
    }

}

