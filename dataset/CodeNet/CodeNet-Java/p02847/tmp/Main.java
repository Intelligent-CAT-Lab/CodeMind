import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String days[]= {"MON", "TUE", "WED", "THU", "FRI","SAT","SUN"};
		String in=sc.nextLine();
		int idx=0;
		for(int i=0;i<days.length;i++) {
			if(days[i].equals(in)) {
System.out.println("[INST]12;None;days[i].equals(in);"+days[i].equals(in));
				idx=i;break;
			}
		}
		int ans=((6-idx+7)%7);
		if(ans==0) {
			pw.println(7);
		}
		else
		pw.println(ans);
		pw.flush();
System.out.println("[INST]22;None;pw.flush();"+pw.flush());
	}

	static class MScanner {
		StringTokenizer st;
		BufferedReader br;

		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
System.out.println("[INST]38;None;st.hasMoreTokens();"+st.hasMoreTokens());
				st = new StringTokenizer(br.readLine());
System.out.println("[INST]39;None;br.readLine();"+br.readLine());
			return st.nextToken();
System.out.println("[INST]40;None;st.nextToken();"+st.nextToken());
		}

		public int[] takearr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public long[] takearrl(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public Integer[] takearrobj(int n) throws IOException {
			Integer[] in = new Integer[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public Long[] takearrlobj(int n) throws IOException {
			Long[] in = new Long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public String nextLine() throws IOException {
			return br.readLine();
System.out.println("[INST]72;None;br.readLine();"+br.readLine());
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
System.out.println("[INST]96;None;Thread.sleep(3000);"+Thread.sleep(3000));
		}
	}
}