import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	long A,B;
	int N;
	public void solve() {
		A = nextLong();
		B = nextLong();
		N = nextInt();

		long ans = Math.abs(A - B);
System.out.println("[INST]13;ans;Math.abs(A - B);"+ans);
		for(int i = 1;i <= N;i++){
			for(int j = 1;j <= N;j++){
				if(i * B % j != 0)continue;
				ans = Math.min(ans, Math.abs(A - i * B / j));
System.out.println("[INST]17;ans;Math.min(ans, Math.abs(A - i * B / j));"+ans);
System.out.println("[INST]17;None;Math.abs(A - i * B / j);"+Math.abs(A - i * B / j));
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		out.flush();
System.out.println("[INST]26;None;out.flush();"+out.flush());
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
System.out.println("[INST]43;buflen;in.read(buffer);"+buflen);
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
System.out.println("[INST]77;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
		}
		return sb.toString();
System.out.println("[INST]79;None;sb.toString();"+sb.toString());
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