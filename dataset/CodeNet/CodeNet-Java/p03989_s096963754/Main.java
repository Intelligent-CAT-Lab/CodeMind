import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;




public class Main {
    private static final int mod = 924844033;
    private static int n,K,m;
    private static Integer [] [] dp;
    private static boolean [] vis,canPair;
    private static int [] fact;
    private static int [] A;

    private static int add(int a,int b) {
        a += b;
        if (a >= mod) a -= mod;
        if (a < 0) a += mod;
        return a;
    }
    private static int mul(int a,int b) {
        return (int)((a*(long)b)%mod);
    }

    private static int solve(int u,int r) {
        if (r == 0) return 1;
        if (u == A.length) return 0;
        if (dp[u][r] != null) return dp[u][r];
        int ret = 0;

        if (canPair[u]) ret = solve(u+2,r-1);
        ret = add(solve(u+1,r),ret);

        dp[u][r] = ret;
        return ret;
    }

    private static void dfs(int u) {
        vis[u] = true;
        A[m++] = u;
        int v = u;
        if (v > n) v -= n;
        v += K;
        if (v > n) return;
        if (u <= n) v += n;
        canPair[m-1] = true;
        dfs(v);
    }


    public static void main(String[] args) throws Exception {
        IO io = new IO(null, null);
        n = io.getNextInt();
        K = io.getNextInt();

        vis = new boolean[2*n+1];
        canPair = new boolean[2*n+1];
        A = new int[2*n];
        m = 0;

        for (int i = 1,j = n+1;i <= n && j <= 2*n;) {
            while (i <= n && vis[i]) i++;
            while (j <= 2*n && vis[j]) j++;
            int k = i;
            if (i <= n && j <= 2*n) {
                if (i <= j-n) k = i;
                else k = j;
            }
            else if (i <= n) k = i;
            else if (j <= 2*n) k = j;
            else break;
            dfs(k);
        }

        fact = new int[n+1];
        fact[0] = 1;
        for (int i = 1;i <= n;i++) fact[i] = mul(fact[i-1],i);

        dp = new Integer[2*n+1][n+1];
        int res = 0;
        for (int r = 0,sgn = 1;r <= n;r++,sgn *= -1) {
//            System.err.println(r + ". " + solve(1,r));
            res = add(res, sgn * mul(solve(0,r),fact[n-r]));
        }
        io.println(res);
        io.close();
    }
}



class IO{
    private BufferedReader br;
    private StringTokenizer st;
    private PrintWriter writer;
    private String inputFile,outputFile;

    public boolean hasMore() throws IOException{
        if(st != null && st.hasMoreTokens()) return true;
        if(br != null && br.ready()) return true;
        return false;
    }
    public String getNext() throws FileNotFoundException, IOException{
        while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String getNextLine() throws FileNotFoundException, IOException{
        return br.readLine().trim();
    }

    public int getNextInt() throws FileNotFoundException, IOException{
        return Integer.parseInt(getNext());
    }
    public long getNextLong() throws FileNotFoundException, IOException{
        return Long.parseLong(getNext());
    }

    public void print(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f" ,x);
    }
    public void println(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f\n" ,x);
    }
    public void print(Object o) throws  IOException{
        writer.print(o.toString());
    }

    public void println(Object o) throws  IOException{
        writer.println(o.toString());
    }
    public IO(String x,String y) throws FileNotFoundException, IOException{
        inputFile = x;
        outputFile = y;
        if(x != null) br = new BufferedReader(new FileReader(inputFile));
        else br = new BufferedReader(new InputStreamReader(System.in));
        if(y != null) writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        else writer = new PrintWriter(new OutputStreamWriter(System.out));
    }

    protected void close() throws IOException{
        br.close();
        writer.close();
    }
    public void outputArr(Object [] A) throws IOException{
        int L = A.length;
        for (int i = 0;i < L;i++) {
            if(i > 0) writer.print(" ");
            writer.print(A[i]);
        }
        writer.print("\n");
    }
}
