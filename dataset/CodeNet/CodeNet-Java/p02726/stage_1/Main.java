import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	static ArrayList<Integer> red,green,colorless;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		int n = sc.nextInt(), x = sc.nextInt()-1, y = sc.nextInt()-1;
		int[] edges = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
var newVariable_0 = Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+Math.abs(j-x));var newVariable_1 = Math.abs(x-i);var newVariable_2 = Math.abs(j-y);var newVariable_3 = Math.abs(y-i);var newVariable_4 = Math.abs(j-x);				int edge = Math.min(j-i, Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+newVariable_4)+1);
				edges[edge]++;
			}
		}
		for (int i = 1; i < n; i++) {
			out.println(edges[i]);
		}
		out.close();
	}
	static class Scanner{
		private BufferedReader br;
		private StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		public String next() throws IOException{
var newVariable_5 = st.hasMoreTokens();			while(st == null || !newVariable_5)
var newVariable_6 = br.readLine();				st = new StringTokenizer(newVariable_6);
var newVariable_7 = st.nextToken();			return newVariable_7;
		}
		public String nextLine() throws IOException {
var newVariable_8 = br.readLine();			return newVariable_8;
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException{
			return Double.parseDouble(next());
		}
		public int[] inArr(int n) throws Exception{
			int a [] = new int[n];
var newVariable_9 = br.readLine();			st = new StringTokenizer(newVariable_9);
			for(int i=0;i<n;i++) {
var newVariable_10 = Integer.parseInt(st.nextToken());var newVariable_11 = st.nextToken();				a[i] = Integer.parseInt(newVariable_11);
			}
			return a;
		}
	}

}