import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	static final int MOD = (int) 1e9 + 7;

	int N;
	int[] memo;

	List<Integer> primes;

	public ArrayList<Integer> getPrimes(int n){

		ArrayList<Integer> ret = new ArrayList<Integer>();

		for(int i = 2;i <= n;i++){

			boolean isPrime = true;

			for(int j = 2;j * j <= i;j++){
				if(i%j==0){
					isPrime = false;
					break;
				}
			}

			if(isPrime){
				ret.add(i);
			}
		}

		return ret;
	}

	public void solve() {
		N = nextInt();
		primes = getPrimes(1000);

		memo = new int[1000 + 1];
		for (int i = 2; i <= N; i++) {

			int tmp = i;
			for(int p : primes){
				while(tmp > 0 && tmp % p == 0){
					tmp /= p;
					memo[p]++;
				}
			}
		}

		long[][] dp = new long[1000+2][10000 + 1];
		dp[2][0] = 1;
		for (int i = 2; i <= 1000; i++) {
			for (int j = 0; j <= memo[i]; j++) {
				if (j + 1 <= memo[i]){
					dp[i][j + 1] += dp[i][j];
					dp[i][j + 1] %= MOD;
				}
				dp[i + 1][0] += dp[i][j];
				dp[i + 1][0] %= MOD;
			}
		}

		out.println(dp[1001][0]);
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}