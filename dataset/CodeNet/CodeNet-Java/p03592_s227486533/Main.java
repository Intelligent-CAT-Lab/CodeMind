import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;

class Main {
    static class Pair{
        long x;
        long cnt;
        public Pair(long x,long cnt){
            this.x=x;
            this.cnt=cnt;
        }
    }
    //public static PrintWriter pw;
    public static PrintWriter pw = new PrintWriter(System.out);

    public static void solve() throws IOException {
        //	pw=new PrintWriter(new FileWriter("C:\\Users\\shree\\Downloads\\small_output_in"));
        FastReader sc = new FastReader();
        long n=sc.L(); long m=sc.L(); long k=sc.L();
        if(solve(n,m,k)) pw.println("Yes"); else pw.println("No");
        pw.close();
    }

    static boolean solve(long n,long m,long k){
        for(long p1=0;p1<=n;p1++)
        for(long q=0;q<=m;q++) {

            if (p1 * m + q * n - 2 * p1 * q == k) return true;
        }
        return false;
    }



    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                try {

                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();

    }

    static BufferedReader br;
    static long M = (long) 1e9 + 7;

    static class FastReader {

        StringTokenizer st;

        public FastReader() throws FileNotFoundException {
            //br=new BufferedReader(new FileReader("C:\\Users\\shree\\Downloads\\B-small-practice.in"));
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

        int I() {
            return Integer.parseInt(next());
        }

        long L() {
            return Long.parseLong(next());
        }

        double D() {
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

        public boolean hasNext() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String s = br.readLine();
                if (s == null) {
                    return false;
                }
                st = new StringTokenizer(s);
            }
            return true;
        }

    }
}