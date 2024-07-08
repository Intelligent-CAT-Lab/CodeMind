import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        long d[]=new long [1000];

        ArrayList<P> lis = new ArrayList<P>();
        long a=9,b=10;
        for(int i=1; i<10; i++) {
var newVariable_0 = lis.add(new P(i, -11+i));        }
var newVariable_1 = lis.add(new P(19, -1));
        for(int i=1; i<15; i++) {
            for (long w=1; w<1000 ;w++ ){
                long x=w*b+a, y=x;
                int e=0;
                while(x>0){e+=x%10; x/=10; }
var newVariable_2 = lis.add(new P(y,(double)y/e));            }
            b*=10; a*=10; a+=9;
        }
        sort(lis);
        long max=0;
var newVariable_3 = lis.size();        for (int w=0; w<newVariable_3 ;w++ ){
var newVariable_4 = lis.get(w);            if(max<newVariable_4.x){
            // db(lis.get(w).x,lis.get(w).d);
var newVariable_5 = lis.get(w);            max=newVariable_5.x;
            out.println(max);
            n--;
            if(n==0)break;
            }
        }

        // db(d);

        // for (int w=0; w<n ;w++ )
        // out.println(d[w]);
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

class P implements Comparable<P>{
    long x;
    double d;
    P(long x, double d) {
        this.x=x;
        this.d=d;
    } 
      
    public int compareTo(P p){
        return (d - p.d)>0?1:-1;//des
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
var newVariable_6 = st.hasMoreTokens();        while( st==null || !newVariable_6 )
var newVariable_7 = x.readLine();            st = new StringTokenizer(newVariable_7);
var newVariable_8 = st.nextToken();        return newVariable_8;
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