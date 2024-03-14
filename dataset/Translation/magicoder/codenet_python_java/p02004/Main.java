import java.util.*;
import java.io.*;

public class p02004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        List<Integer> rr = new ArrayList<>();

        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
            break;
        }

        for (int r : rr) {
            pw.println(r);
        }

        pw.close();
    }

    static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t++;
                if (t == 4) {
                    r++;
                    t = 0;
                }
            } else {
                t--;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }
}