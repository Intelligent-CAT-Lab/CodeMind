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
				int edge = Math.min(j-i, Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+Math.abs(j-x))+1);
System.out.println("[INST]15;edge;Math.min(j-i, Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+Math.abs(j-x))+1);"+edge);
System.out.println("[INST]15;None;Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+Math.abs(j-x));"+Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+Math.abs(j-x)));
System.out.println("[INST]15;None;Math.abs(x-i);"+Math.abs(x-i));
System.out.println("[INST]15;None;Math.abs(j-y);"+Math.abs(j-y));
System.out.println("[INST]15;None;Math.abs(y-i);"+Math.abs(y-i));
System.out.println("[INST]15;None;Math.abs(j-x);"+Math.abs(j-x));
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
			while(st == null || !st.hasMoreTokens())
System.out.println("[INST]31;None;st.hasMoreTokens();"+st.hasMoreTokens());
				st = new StringTokenizer(br.readLine());
System.out.println("[INST]32;None;br.readLine();"+br.readLine());
			return st.nextToken();
System.out.println("[INST]33;None;st.nextToken();"+st.nextToken());
		}
		public String nextLine() throws IOException {
			return br.readLine();
System.out.println("[INST]36;None;br.readLine();"+br.readLine());
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
			st = new StringTokenizer(br.readLine());
System.out.println("[INST]49;None;br.readLine();"+br.readLine());
			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(st.nextToken());
System.out.println("[INST]51;None;Integer.parseInt(st.nextToken());"+Integer.parseInt(st.nextToken()));
System.out.println("[INST]51;None;st.nextToken();"+st.nextToken());
			}
			return a;
		}
	}

}