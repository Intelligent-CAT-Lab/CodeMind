import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		int diff = d == 0 ? 1 : 2;
		double result = ((n - d) * diff / Math.pow(n, 2)) * (m - 1);
System.out.println("[INST]14;None;Math.pow(n, 2);"+Math.pow(n, 2));

		System.out.format("%1$.10f\r\n", result);
System.out.println("[INST]16;None;System.out.format('%1$.10f\r\n', result);"+System.out.format("%1$.10f\r\n", result));
	}

	public static class Pair implements Comparable<Pair> {
		private int key;
		private int value;

		public Pair(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "{" + key + ", " + value + "}";
		}

		@Override
		public int compareTo(Pair other) {
			double t = this.value / this.key;
			double o = other.value / other.key;
			if (t < o) {
				return -1;
			} else if (t > o) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;
System.out.println("[INST]56;None;System.getProperty('sun.desktop');"+System.getProperty("sun.desktop"));

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;
		private StringBuilder buffer = new StringBuilder();

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
System.out.println("[INST]79;read;inputStream.read();"+read);
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);
System.out.println("[INST]84;read;inputStream.read();"+read);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
System.out.println("[INST]113;read;inputStream.read();"+read);
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);
System.out.println("[INST]118;read;inputStream.read();"+read);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			int read = skip();
			do {
				buffer.append((char) read);
System.out.println("[INST]152;None;buffer.append((char) read);"+buffer.append((char) read));
			} while ((read = inputStream.read()) > 0x20);
System.out.println("[INST]153;read;inputStream.read();"+read);

			String text = buffer.toString();
			buffer.delete(0, buffer.length());
System.out.println("[INST]156;None;buffer.delete(0, buffer.length());"+buffer.delete(0, buffer.length()));
System.out.println("[INST]156;None;buffer.length();"+buffer.length());

			return text;
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
System.out.println("[INST]163;read;inputStream.read();"+read);
				;

			return read;
		}
	}
}
