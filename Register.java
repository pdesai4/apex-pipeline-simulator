/**
 * Created by sagar on 11/4/16.
 */
public class Register {
    private static String[] register = new String[15];
    private String x;
    private String pc;
    private String flag;

    static String getRegister(String tempRegister) {
        int registerNumber = Integer.parseInt(tempRegister.replace("R",""));
        return register[registerNumber];
    }

    static void setRegister(String tempRegister, String value) {
        int registerNumber = Integer.parseInt(tempRegister.replace("R",""));
        register[registerNumber] = value;
    }
}
