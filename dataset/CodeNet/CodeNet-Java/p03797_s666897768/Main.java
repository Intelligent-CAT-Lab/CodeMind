
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			//			solveB2();
			solveC();
			// solveD();
			// solveE();
			// solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int numN = nextInt();

		int resX = numN * 800;
		int resY = (numN / 15) * 200;

		out.println(resX - resY);
	}

	private void solveB() {
		int numN = nextInt();

		BigDecimal CONST = new BigDecimal(Math.pow(10, 9)).add(new BigDecimal("7"));
		BigDecimal res = BigDecimal.ONE;
		for (int i = 1; i <= numN; i++) {
			res = res.multiply(new BigDecimal(Integer.toString(i)));
		}

		out.println(res.remainder(CONST));
	}

	private void solveB2() {
		int numN = nextInt();
		long CONST = (long) (Math.pow(10, 9) + 7);

		long res = 1;
		for (int i = 1; i <= numN; i++) {
			res = (res * i) % CONST;
		}

		out.println(res);
	}

	private void solveC() {
		long numS = nextLong();
		long numC = nextLong();

		long res = 0;
		if (numS >= numC) {
			res = numC / 2;
		} else {
			long wk = numC - (numS * 2);
			if (wk >= 0) {
				res = numS + (wk / 4);
			} else {
				long wkC = numC / 2;
				long wkS = numS;
				while (wkC > 0 || wkS > 0) {
					wkC--;
					wkS--;
					res++;
				}
			}
		}

		out.println(res);
	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}