import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Arrays;
public class Main 
{
    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
var newVariable_0 = tk.hasMoreTokens();            if(newVariable_0)
var newVariable_1 = Integer.parseInt(tk.nextToken());var newVariable_2 = tk.nextToken();                return Integer.parseInt(newVariable_2);
var newVariable_3 = br.readLine();            tk=new StringTokenizer(newVariable_3);
            return nextInt();
        }
        public long nextLong() throws IOException
        {
var newVariable_4 = tk.hasMoreTokens();            if(newVariable_4)
var newVariable_5 = Long.parseLong(tk.nextToken());var newVariable_6 = tk.nextToken();                return Long.parseLong(newVariable_6);
var newVariable_7 = br.readLine();            tk=new StringTokenizer(newVariable_7);
            return nextLong();
        }
        public String next() throws IOException
        {
var newVariable_8 = tk.hasMoreTokens();            if(newVariable_8)
var newVariable_9 = tk.nextToken();                return (newVariable_9);
var newVariable_10 = br.readLine();            tk=new StringTokenizer(newVariable_10);
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
var newVariable_11 = br.readLine();            return newVariable_11;
        }
        public double nextDouble() throws IOException
        {
var newVariable_12 = tk.hasMoreTokens();            if(newVariable_12)
var newVariable_13 = Double.parseDouble(tk.nextToken());var newVariable_14 = tk.nextToken();                return Double.parseDouble(newVariable_14);
var newVariable_15 = br.readLine();            tk=new StringTokenizer(newVariable_15);
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
var newVariable_16 = tk.hasMoreTokens();            if(newVariable_16)
var newVariable_17 = tk.nextToken().charAt(0);var newVariable_18 = tk.nextToken();                return (newVariable_18.charAt(0));
var newVariable_19 = br.readLine();            tk=new StringTokenizer(newVariable_19);
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    public static void main(String args[]) throws IOException
    {
        new Thread(null, new Runnable() {
            public void run() {
                try
                {
                    solve();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static long dp[][];
    static long mod=1000000007;
    static int XYZ_MASK;
    static long pow[];
    static int merge(int lastMask, int digit){
        int newMask=lastMask<<digit;
        newMask&=(0b11111111111111111);
        newMask|=(1<<(digit-1));
        return newMask;
    }
    static long sol(int i, int mask){
        if((mask&XYZ_MASK)==XYZ_MASK){
            return pow[i];
        }
        if(i==0){
            return 0;
        }
        if(dp[i][mask]!=-1)
            return dp[i][mask];
        dp[i][mask]=0;
        for(int digit=1;digit<=10;digit++){
            dp[i][mask]+=sol(i-1,merge(mask,digit));
        }
        dp[i][mask]%=mod;
        return dp[i][mask];
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        pow=new long[n+1];
        pow[0]=1;
        for(int i=1;i<=n;i++)
            pow[i]=(10*pow[i-1])%mod;
        int x=in.nextInt(), y=in.nextInt(), z=in.nextInt();
        XYZ_MASK=(1<<(z-1))|(1<<(z+y-1))|(1<<(z+y+x-1));
        dp=new long[n+1][1<<17];
        for(int i=0;i<=n;i++)
            Arrays.fill(dp[i], -1);
        out.println(sol(n,0));
        out.close();
        
    }
}
