import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);
		
		out.flush();
System.out.println("[INST]16;None;out.flush();"+out.flush());
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		String s = sc.next();

		int m = Integer.parseInt(s.charAt(2) + "" + "" + s.charAt(3));
System.out.println("[INST]22;m;Integer.parseInt(s.charAt(2) + '' + '' + s.charAt(3));"+m);
System.out.println("[INST]22;None;s.charAt(2);"+s.charAt(2));
System.out.println("[INST]22;None;s.charAt(3);"+s.charAt(3));
		int y = Integer.parseInt(s.charAt(0) + "" + "" + s.charAt(1));
System.out.println("[INST]23;y;Integer.parseInt(s.charAt(0) + '' + '' + s.charAt(1));"+y);
System.out.println("[INST]23;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]23;None;s.charAt(1);"+s.charAt(1));

			if(y <= 12 && m <= 12 && y > 0 && m > 0){
				out.println("AMBIGUOUS");
				return;
			}
			if(m > 0 && m <= 12){
				out.println("YYMM");
				return;
			}
			if(y > 0 && y <= 12){
				out.println("MMYY");
				return;
			}
		out.println("NA");

	}

	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
    }
 }

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]65;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
            try {
                tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]67;None;reader.readLine();"+reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
System.out.println("[INST]72;None;tokenizer.nextToken();"+tokenizer.nextToken());
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]76;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
            try {
                return reader.readLine();
System.out.println("[INST]78;None;reader.readLine();"+reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
System.out.println("[INST]84;None;tokenizer.nextToken('\n');"+tokenizer.nextToken("\n"));
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
     }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}