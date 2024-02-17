import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int x,y;
	public void solve() {
		x = nextInt();
		y = nextInt();

		if(x >= 0){
			if(y >= 0){
				if(x > y){
					if(y == 0){
						out.println(x-y+1);
					}else{
						out.println(x-y+2);
					}
				}else{
					out.println(y-x);
				}
			}else{
				out.println(Math.abs(Math.abs(y)-x)+1);
			}
		}else{
			if(y >= 0){
				if(y == 0){
					out.println(Math.abs(Math.abs(x)-y));
				}else{
					out.println(Math.abs(Math.abs(x)-y)+1);
				}
			}else{
				if(x > y){
					out.println(x-y+2);
				}else{
					out.println(y-x);
				}
			}
		}
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