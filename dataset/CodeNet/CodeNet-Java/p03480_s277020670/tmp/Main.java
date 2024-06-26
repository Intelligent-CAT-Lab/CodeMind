import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		char[] c=ir.next().toCharArray();
		int n=c.length;
		int ret=0;
		for(int i=0;i<2;i++){
			int now=0;
			int x=(int)1e9,y=(int)1e9;
			for(;;){
				while(now<n&&c[now]!='0'+i)
					now++;
				int p=now;
				while(now<n&&c[now]=='0'+i)
					now++;
				x=Math.min(x,now-p);
System.out.println("[INST]24;x;Math.min(x,now-p);"+x);
				y=Math.min(y,Math.max(p,n-now));
System.out.println("[INST]25;y;Math.min(y,Math.max(p,n-now));"+y);
System.out.println("[INST]25;None;Math.max(p,n-now);"+Math.max(p,n-now));
				if(now>=n)
					break;
			}
			ret=Math.max(ret,Math.max(x, y));
System.out.println("[INST]29;ret;Math.max(ret,Math.max(x, y));"+ret);
System.out.println("[INST]29;None;Math.max(x, y);"+Math.max(x, y));
		}
		out.println(ret);
	}

	public static void main(String[] args) throws Exception {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
System.out.println("[INST]38;None;out.flush();"+out.flush());
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
System.out.println("[INST]57;lenbuf;in.read(buffer);"+lenbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
System.out.println("[INST]94;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
				b = readByte();
			}
			return sb.toString();
System.out.println("[INST]97;None;sb.toString();"+sb.toString());
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
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

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}