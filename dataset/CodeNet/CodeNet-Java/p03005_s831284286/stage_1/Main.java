import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = scan.nextInt();
        int k = scan.nextInt();

        if (k == 1) {
            out.println(0);
        } else {
            out.println(n - k);
        }

        out.close();
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
var newVariable_0 = st.hasMoreElements();            while (st == null || !newVariable_0) {
                try {
var newVariable_1 = br.readLine();                    st = new StringTokenizer(newVariable_1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
var newVariable_2 = st.nextToken();            return newVariable_2;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------

}