import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00088 {
    private static BufferedReader br = null;

    static {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String stdin = null;

        while ((stdin = parseStdin())!= null) {
            String work = "";
            String out = "";

            for (int loop = 0; loop < stdin.length(); loop++) {
                work += MyConv.Encode(stdin.charAt(loop));
            }

            while (work.length() % 5!= 0) {
                work += "0";
            }

            for (int loop = 0; loop < work.length(); loop += 5) {
                out += MyConv.Decode(work.substring(loop, loop + 5));
            }

            System.out.println(out);
        }
    }

    private static String parseStdin() {
        String stdin = null;

        try {
            stdin = br.readLine();
        } catch (IOException e) {
        }

        return stdin;
    }
}

class MyConv {
    public static String Encode(char key) {
        switch (key) {
            case'':
                return "101";
            case '\'':
                return "000000";
            case ',':
                return "000011";
            case '-':
                return "10010001";
            case '.':
                return "010001";
            case '?':
                return "000001";
            case 'A':
                return "100101";
            case 'B':
                return "10011010";
            case 'C':
                return "0101";
            case 'D':
                return "0001";
            case 'E':
                return "110";
            case 'F':
                return "01001";
            case 'G':
                return "10011011";
            case 'H':
                return "010000";
            case 'I':
                return "0111";
            case 'J':
                return "10011000";
            case 'K':
                return "0110";
            case 'L':
                return "00100";