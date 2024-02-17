import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main	{
		static class Pair  implements Comparable<Pair> {
   int a;
   int b;
   public Pair(int x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p1){
      return a+b-p1.a-p1.b;
   }
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	result = prime * result + b;
	return result;
}
@Override
public boolean equals(Object obj) {
	Pair p = (Pair)obj;
	if (this.a==p.a && this.b==p.b)
		return true;
	else return false;
	
}
     
   
 }
static class TrieNode{
  TrieNode[]child;
  int w;
  boolean term;
  TrieNode(){
    child = new TrieNode[26];  
  }
}
  public static int gcd(int a,int b)
  {
    if(a<b)

      return gcd(b,a);
    if(b==0)
      return a;
    return gcd(b,a%b);
    
  }
  //static long ans = 0;
  static long mod = 998244353;//(long)(1e9+7);
   
    public static void main(String[] args) throws Exception {
       new Thread(null, null, "Anshum Gupta", 99999999) {
            public void run() {
                try {
                    solve();
                } catch(Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }

static long pow(long x,long y){
    if(y == 0)return 1;
    if(y==1)return x;
    long a = pow(x,y/2);
    a = (a*a)%mod;
    if(y%2==0){
        return a;
    }
    return (a*x)%mod;
}
static long my_inv(long x) {
	return pow(x,mod-2);
}
static long bin(int n,int r) {
	return (((fact[n]*inv_fact[n-r])%mod)*inv_fact[r])%mod;
}
static long mxx;
static int mxN = (int)(1e5+5);
static long[]fact,inv_fact;

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;//s.nextInt();
        mxx = (long)(1e18+5);
        while(t-->0){
        	int r = s.nextInt();
        	double pi = 3.141592653;
        	out.println(2*pi*r);
        }
           
        out.flush();
}
 
     
 
 
 
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
         
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
