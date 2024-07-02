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
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        // int n=sc.nextInt();
        char c[]=sc.nextString().toCharArray();
        int l=c.length;

        if(c[0]=='0' || c[l-1]=='1'){out.println(-1);out.flush();return;}
System.out.println("[INST]23;None;out.flush();"+out.flush());
        else {
            for (int i=0; i<l/2; i++) {
                if(c[i]!=c[l-i-2]){out.println(-1);out.flush(); return;}
System.out.println("[INST]26;None;out.flush();"+out.flush());
            }
        }

        out.println(1+" "+2);

        for (int i=3,s=2; i<=l; i++) {
            out.println(s+" "+i);
            if(c[i-2]=='1'){
                s=i;
            }
        }


      
        // out.println(ans);
        out.flush();
System.out.println("[INST]42;None;out.flush();"+out.flush());
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  

    static long gcd(long a, long b){
        if(min(a,b) == 0)return max(a,b);
System.out.println("[INST]51;None;min(a,b);"+min(a,b));
System.out.println("[INST]51;None;max(a,b);"+max(a,b));
        return gcd(max(a,b) % min(a,b),min(a,b));
System.out.println("[INST]52;None;max(a,b);"+max(a,b));
System.out.println("[INST]52;None;min(a,b);"+min(a,b));
System.out.println("[INST]52;None;min(a,b);"+min(a,b));
    }
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return d-p.d; //des
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
System.out.println("[INST]79;None;st.hasMoreTokens();"+st.hasMoreTokens());
            st = new StringTokenizer(x.readLine());
System.out.println("[INST]80;None;x.readLine();"+x.readLine());
        return st.nextToken();
System.out.println("[INST]81;None;st.nextToken();"+st.nextToken());
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
