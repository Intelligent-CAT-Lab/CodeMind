import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		if(n % 2 != 0){
			final int fst = n / 2 + 1;
			final int snd = n / 2;
			
			for(int i = 0; i < fst; i++){
				System.out.print((i == 0 ? "" : " ") + 0);
			}
			for(int i = 0; i < snd; i++){
				System.out.print(" " + m);
			}
			System.out.println();
		}else{
			final int fst = n / 2;
			
			for(int i = 0; i <= fst; i++){
				System.out.print((i == 0 ? "" : " ") + 0);
			}
			for(int i = 0; i < fst - 1; i++){
				System.out.print(" " + m);
			}
			System.out.println();
			
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
var newVariable_0 = br.readLine();				tok = new StringTokenizer(newVariable_0);
			}
		}

		private boolean hasNext() {
var newVariable_1 = tok.hasMoreTokens();			return tok != null && newVariable_1;
		}

		public String next() throws IOException {
			getLine();
var newVariable_2 = tok.nextToken();			return newVariable_2;
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}
}