
import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.solve(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void solve(String[] args) throws Exception {
        MyScanner scanner = new MyScanner();
        String A = scanner.next();
        String B = scanner.next();
        String C = scanner.next();
        if (A.charAt(A.length() -1) == B.charAt(0) && B.charAt(B.length() -1) == C.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() {
            try {
                return Integer.parseInt(next());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }

        public double nextDouble() {
            try {
                return Double.parseDouble(next());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }

        public long nextLong()  {
            try {
                return Long.parseLong(next());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
    }
}
