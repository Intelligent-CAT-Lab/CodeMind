import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        if (a + b < 2 * c) {
            out.println(x * a + y * b);
        } else {
            int min = Math.min(x, y);
System.out.println("[INST]17;min;Math.min(x, y);"+min);
            int max = Math.max(x, y);
System.out.println("[INST]18;max;Math.max(x, y);"+max);
            int res = 0;
            res += 2 * c * min;
            if (max == x) {
                res += Math.min(a, 2 * c) * (max - min);
System.out.println("[INST]22;None;Math.min(a, 2 * c);"+Math.min(a, 2 * c));
            } else {
                res += Math.min(b, 2 * c) * (max - min);
System.out.println("[INST]24;None;Math.min(b, 2 * c);"+Math.min(b, 2 * c));
            }
            out.println(res);
        }

        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]51;None;st.hasMoreTokens();"+st.hasMoreTokens());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]53;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]58;None;st.nextToken();"+st.nextToken());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
System.out.println("[INST]68;str;br.readLine();"+str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] nextDoubleArray(int n) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public char[] nextCharArray(int n) {
            char[] arr = nextLine().trim().replaceAll("\\s", "").toCharArray();
            return arr;
        }

        public String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }
}
