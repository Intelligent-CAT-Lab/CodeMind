import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	static int MOD = (int)1e9 + 7;
	long N;
	TreeMap<Key,Long> map;

	private class Key implements Comparable<Key>{
		long x,y;
		public Key(long x,long y){
			this.x = x;
			this.y = y;
		}

		public int compareTo(Key p){
			if(Long.compare(this.x,p.x) == 0){
				return Long.compare(this.y, p.y);
			}
			return Long.compare(this.x, p.x);
		}
	}

	public long dfs(long S,long X){

		if(S == 0)return 1;

		Key key = new Key(S,X);

		if(map.containsKey(key)){
			return map.get(key);
		}

		long ret = 0;
		ret += dfs(S >> 1,X >> 1) % MOD;
		ret %= MOD;

		if(S > 1){
			ret += dfs((S - 2) >> 1,X >> 1) % MOD;
			ret %= MOD;
		}

		ret += dfs((S - 1) >> 1,(X - 1) >> 1) % MOD;
		ret %= MOD;

		map.put(key, ret);
		return ret;
	}

	public void solve() {
		N = nextLong();
		map = new TreeMap<Key,Long>();
		out.println(dfs(N,N));
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