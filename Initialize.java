import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/**
 */
class Initialize {
    private String path;

    void setPath(String path) {
        this.path = path;
    }

    void initialize() {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            HashMap<Integer, Instruction> hashMap = new HashMap<>();
            for (int i = 4000; (line = bufferedReader.readLine()) != null; i++) {
                Instruction instruction = new Instruction();
                instruction.setInstructionStr(line.toUpperCase());
                hashMap.put(i, instruction);
            }

            Set<Integer> keys = hashMap.keySet();
            for (Integer key : keys) {
                Instruction instruction = hashMap.get(key);
                System.out.println(instruction + "@");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fileReader != null) {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
