import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
  
	public static void main(String[] args) {
	   
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    long c = sc.nextLong();
	    long k = sc.nextLong();
	    long ans = 0;
	    ans+=Math.min(a,k);
	    k-=Math.min(a, k);
	    k-=Math.min(b, k);
	    if(k > 0) {
	    	ans-=Math.min(k, c);
	    }
	    out.print(ans);
		out.close();
   }
	
	
}

