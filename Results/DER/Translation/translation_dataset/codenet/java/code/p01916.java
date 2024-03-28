import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01916 implements Runnable {
	char[] s;
	int[] a,b;

	public void solve() {
		s = next().toCharArray();

		a = new int[26];
		b = new int[1111];

		for(int i = 0;i < s.length;i++){
			a[s[i]-'a']++;
		}

		for(int i = 0;i < 26;i++){
			b[a[i]]++;
		}

		for(int i = 999;i >= 0;i-=2){
			if(b[i] > 0){
				b[i]--;
				break;
			}
		}

		int m = 0;

		for(int i = 1;i <= 1000;i+=2){
			m += b[i];
		}

		if(m%2 == 0){
			out.println(m/2);
		}else{
			out.println(m/2+1);
		}
	}

	public static void main(String[] args) {
		new Thread(null, new p01916(), "", 64 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new p01916().solve();
		out.close();

	}
}