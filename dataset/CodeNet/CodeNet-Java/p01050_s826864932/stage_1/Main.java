import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static int compress(int[] counts){
		int ret = 0;
		
		LOOP:
		while(true){
			boolean updated = false;
			
			for(int pos = 0; pos < counts.length; pos++){
				if(counts[pos] == 0){ continue; }
				
				int len = 1;
				for(int next = pos + 1; next < counts.length; next++){
					if(counts[next] == 0){ break; }
					len++;
				}
				
				if(len >= 3){
					updated = true;
					
					ret += len - 3;
					for(int i = pos; i < pos + len; i++){
						counts[i]--;
					}
					
					continue LOOP;
				}	
			}
			
			if(!updated){
				break;
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.next().toCharArray();
		
		int[] alpha_count = new int[26];
		int[] number_count = new int[10];
		
		for(char c : input){
			if('a' <= c && c <= 'z'){
				alpha_count[c - 'a']++;
			}else{
var newVariable_0 = Character.getNumericValue(c);				number_count[newVariable_0]++;
			}
		}
		
		int length = input.length;
		length -= compress(alpha_count);
		length -= compress(number_count);
		
		System.out.println(length);
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
var newVariable_1 = br.readLine();				tok = new StringTokenizer(newVariable_1);
			}
		}

		private boolean hasNext() {
var newVariable_2 = tok.hasMoreTokens();			return tok != null && newVariable_2;
		}

		public String next() throws IOException {
			getLine();
var newVariable_3 = tok.nextToken();			return newVariable_3;
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