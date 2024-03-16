import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class p03145 {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int a = fr.nextInt();
        int b = fr.nextInt();
        System.out.println(a * b / 2);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }         
    }
}