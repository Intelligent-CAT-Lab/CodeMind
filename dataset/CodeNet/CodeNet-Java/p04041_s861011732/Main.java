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
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
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
