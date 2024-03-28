import java.util.*;
import java.io.*;

public class atcoder_ABC155_E {
    static Scanner in;
    static String[] inputMethods = {"clipboard", "file", "key"};
    static int usingMethod = 0;
    static String inputMethod = inputMethods[usingMethod];
    static int mod = 1000000007;

    public static void main(String[] args) throws Exception {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            if (inputMethod.equals(inputMethods[0])) {
                in = new Scanner(new File("inputFile.txt"));
            } else if (inputMethod.equals(inputMethods[1])) {
                in = new Scanner(new File("inputFile.txt"));
            } else {
                // Handle other input methods
            }
        } else {
            // Handle other operating systems
        }

        int ret = main();
        if (ret != -1) {
            System.out.println(ret);
        }
    }

    static int main() throws Exception {
        String s = in.nextLine();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cc = na + Integer.parseInt(String.valueOf(s.charAt(i)));
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == 0) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        return pp;
    }
}