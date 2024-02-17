import java.util.*;
import java.io.*;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        // int n=sc.nextInt();
        char s[]=sc.nextString().toCharArray();
        int n=s.length;
        int a[] = new int[n];
        int c[] = new int[n];
        int da[] = new int[n];
        int dc[] = new int[n];

        if(s[0]=='A')a[0]++;
        if(s[0]=='?')da[0]++;
        for(int i=1; i<n; i++) {
            a[i]=a[i-1]+ (s[i]=='A' ? 1:0);
            da[i]=da[i-1]+ (s[i]=='?' ? 1:0);
        }
        
        if(s[n-1]=='C')c[n-1]++;
        if(s[n-1]=='?')dc[n-1]++;
        for(int i=n-2; 0<=i; i--) {
            c[i]=c[i+1]+ (s[i]=='C' ? 1:0);
            dc[i]=dc[i+1]+ (s[i]=='?' ? 1:0);
        }
        long ans=0;
        long t[]= new long[n+1];
        t[0]++;
        for(int i=1; i<=n; i++) {
            t[i]=t[i-1]*3;
            t[i]%=mod;
        }
        for(int i=1; i<n-1; i++) {
            long e=0,f=0;
            if(s[i]=='B' || s[i]=='?'){
                e=a[i]*t[da[i-1]]%mod;
                if(da[i-1]>=1)e+=t[da[i-1]-1]*da[i-1];
                e%=mod;
                f=c[i]*t[dc[i+1]]%mod;
                if(dc[i+1]>=1)f+=t[dc[i+1]-1]*dc[i+1];
                f%=mod;
                e=(e*f)%mod;
                ans+=e;
                ans%=mod;
            }
        }

        out.println(ans);
        out.flush();
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return Integer.compare(d,p.d); //des
    }
}

class Reader
{ 
    private BufferedReader x;
    private StringTokenizer st;
    
    public Reader(InputStream in)
    {
        x = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException
    {
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(x.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(nextString());
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}