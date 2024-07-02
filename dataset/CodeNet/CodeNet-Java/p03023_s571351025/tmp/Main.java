import java.util.*;
import java.io.*;

public class Main {

	private static void solve(){
		//Implement solution here.
		int N = ni();
		System.out.println((N - 2) * 180);
	}

	//Switch input source (stdin/file)
	private static BufferedReader br;
	public static void main(String[] args){
		br = new BufferedReader(new InputStreamReader(System.in));
		String debugDataPath = System.getenv("DD_PATH");        
System.out.println("[INST]15;debugDataPath;System.getenv('DD_PATH');"+debugDataPath);
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		boolean hasNext = true;
		while(hasNext){
			solve();	
			try{
				br.mark(1);
System.out.println("[INST]27;None;br.mark(1);"+br.mark(1));
				if(br.read() > 0){
System.out.println("[INST]28;None;br.read();"+br.read());
					br.reset();			
System.out.println("[INST]29;None;br.reset();"+br.reset());
					System.out.println("---");
				} else {
					hasNext = false;
				}
			}catch(Exception e){
				throw new RuntimeException(e);
			} 
		}
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
System.out.println("[INST]45;None;br.readLine();"+br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
System.out.println("[INST]50;None;tokenizer.nextToken();"+tokenizer.nextToken());
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}