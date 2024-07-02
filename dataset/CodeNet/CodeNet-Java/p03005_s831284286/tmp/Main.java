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
            while (st == null || !st.hasMoreElements()) {
System.out.println("[INST]34;None;st.hasMoreElements();"+st.hasMoreElements());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]36;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]41;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]59;str;br.readLine();"+str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------

}