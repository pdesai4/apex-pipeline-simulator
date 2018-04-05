/**
 *
 */
class Enums {
    enum Opcode {
        ADD,
        SUB,
        MOVC,
        AND,
        OR,
        EX_OR,
        BAL,
        JUMP,
        BZ,
        BNZ,
        LOAD,
        STORE,
        HALT,
    }

    enum OperandType {
        REGISTER,
        LITERAL,
    }
}
