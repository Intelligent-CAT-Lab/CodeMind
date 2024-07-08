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
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		String s = sc.next();

var newVariable_0 = s.charAt(2);var newVariable_1 = s.charAt(3);		int m = Integer.parseInt(s.charAt(2) + "" + "" + newVariable_1);
var newVariable_2 = s.charAt(0);var newVariable_3 = s.charAt(1);		int y = Integer.parseInt(s.charAt(0) + "" + "" + newVariable_3);

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
var newVariable_4 = tokenizer.hasMoreTokens();        if (tokenizer == null || !newVariable_4) {
            try {
var newVariable_5 = reader.readLine();                tokenizer = new StringTokenizer(newVariable_5);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
var newVariable_6 = tokenizer.nextToken();        return newVariable_6;
    }

    public String nextLine() {
var newVariable_7 = tokenizer.hasMoreTokens();        if (tokenizer == null || !newVariable_7) {
            try {
var newVariable_8 = reader.readLine();                return newVariable_8;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

var newVariable_9 = tokenizer.nextToken("\n");        return newVariable_9;
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