import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int test_cases = 1;
        Solver s = new Solver();
        for (int i = test_cases; i >= 1; i--) {
            s.solve(1, in, out);
        }
        out.close();
    }

    static class Solver {

        public void solve(int test_number, InputReader in, PrintWriter out) throws IOException {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int ans = 0;
            for (int i = a; i <= b; i++) if (i >= c && i <= d) ans++;
            if (ans > 0) ans--;
            out.print(ans);
        }

        private boolean check(char[] s) {
            for (int i = 0; i < s.length / 2; i++) if (s[i] != s[s.length - i - 1]) return false;
            return true;
        }
    }
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}