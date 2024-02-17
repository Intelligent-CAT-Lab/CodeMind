import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws IOException{
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long s = sc.nextLong();
		long[] ans = new long[n];
		for(int i=0;i<k;i++) ans[i] = s;
		    for(int i=0;i<n;i++){
		        if(ans[i]==0) System.out.print((s!=1000000000 ? s+1 : 1)+" ");
		        else System.out.print(ans[i]+" ");
		    }
	}
	static class Pair {
	    long x, l;
	    public Pair(long a, long b){
	        x = a;
	        l = b;
	    }
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}
		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}
		String next() {
			while (st == null || !st.hasMoreTokens()) {
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
	}
}