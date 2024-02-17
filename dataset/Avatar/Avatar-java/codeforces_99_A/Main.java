import java.util.*;
import java.io.*;
import java.util.stream.*;

public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        if (System.getProperty("ONLINE_JUDGE") == null) {
            File inputFile = new File("/Users/vipinjain/self/cp/input.txt");
            File outputFile = new File("/Users/vipinjain/self/cp/output.txt");
            br = new BufferedReader(new FileReader(inputFile));
            bw = new BufferedWriter(new FileWriter(outputFile));
        }

        int tests;
        tests = 1;
        while (tests-- > 0) {
            solve();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void solve() throws Exception {
        String str = br.readLine();
        int index = str.indexOf(".");
        if (index == -1) {
            bw.write(str);
            return;
        }

        int d = str.charAt(index + 1) - '0';
        int i = str.charAt(index - 1) - '0';

        if (i == 9) {
            bw.write("GOTO ▁ Vasilisa.");
            return;
        }

        if (d >= 5) {
            bw.write(str.substring(0, index - 1) + (i + 1));
        } else {
            bw.write(str.substring(0, index));
        }

        bw.write("\n");
    }
}