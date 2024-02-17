import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{ 
 
 
    static long mod=1000000007;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1};
    // PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
    //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // ArrayList<Integer> lis = new ArrayList<Integer>();
    // ArrayList<Integer> map[]=new ArrayList[26];
    static HashMap<Integer,Long> map = new HashMap<Integer,Long>();

    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // long n=sc.nextLong();
        // char c[][] = new char[h][w];
        // long a[] = new long [n];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        // int n=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt();
        int d[][] = new int[100][100];
        int c=0,mx=max(a,b),min=min(a,b);
        lp:for (int i=0;i<100; i+=4) {
            for (int t=0;t<100; t+=4) {
                d[i][t]=1;d[i][t+1]=1;d[i][t+2]=1;
                d[i+1][t]=1;d[i+1][t+1]=1;d[i+1][t+2]=1;
                d[i+2][t]=1;d[i+2][t+1]=1;d[i+2][t+2]=1;
                c++; if(c==mx)break lp;
            }
        }
        c=0;
        if(min>1)
        lp:for (int i=1;i<100; i+=4) {
                for (int t=1;t<100; t+=4) {
                    d[i][t]=0;
                    c++; if(c==min-1)break lp;
            }
        }
        // for (int i=0;i<99; i++)db(d[i]);

        out.println("100 100");
        for (int i=0;i<100; i++){ String s="";
            for (int t=0;t<100; t++){
                if(a<=b)s=s+( d[i][t]<1? ".":"#" );
                else s=s+( d[i][t]<1? "#":"." );
            }
            out.println(s);
        }

        
        // out.println(ans);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
     
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }
     
    static boolean bit(long x,int k){
        // weather k-th bit (from right) be one or zero
        return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
    }    
}

class XY {
    int x,y,d;
    XY(int x, int y, int d) {
        this.x=x;
        this.y=y;
        this.d=d;
    } 
}
 
class P implements Comparable<P>{
    int x,y;
    P(int x, int y) {
        this.x=x;
        this.y=y;
    } 
      
    public int compareTo(P p){
        return -x + p.x;//des
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