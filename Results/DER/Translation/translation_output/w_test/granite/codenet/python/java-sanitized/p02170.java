import java.io.*;
import java.util.*;

public class p02170 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null ||!st.hasMoreElements()) {
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

    static FastReader s = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    private static int[] rai(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static int[][] rai(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    private static long[] ral(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        return arr;
    }

    private static long[][] ral(int n, int m) {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextLong();
            }
        }
        return arr;
    }

    private static int ri() {
        return s.nextInt();
    }

    private static long rl() {
        return s.nextLong();
    }

    private static String rs() {
        return s.next();
    }

    static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }

    static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int MOD=998244353;

    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        int t = 1;
        while (t-- > 0)
        {
            int n=ri();
            int k=ri();
            int a=ri();

            long[] arr=new long[k+1];
            long modInv=modInverse(n,MOD);
            long modInv100=modInverse(100,MOD);
            long A=((a*modInv100)%MOD+MOD)%MOD;

            arr[k-1]=1;
            for(int i=k-2;i>=0;i--)
            {
                if(k-i<=n)
                {
                    arr[i]=(arr[i+1]+((n-(k-i)+1)*modInv)%MOD)%MOD;
                }
                else
                {
                    arr[i]=(arr[i+1]+(A*(arr[i+n+1]-arr[i+1]+MOD))%MOD)%MOD;
                }
            }

            ans.append((arr[0]-arr[1]+MOD)%MOD).append("\n");
        }
        out.print(ans.toString());
        out.flush();
    }

    static long modInverse(long a, long m) {
        a = a % m;
        for (int x = 1; x < m; x++)
            if (((a % m) * (x % m)) % m == 1)
                return x;
        return 1;
    }
}