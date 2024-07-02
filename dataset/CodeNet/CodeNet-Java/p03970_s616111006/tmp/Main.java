
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void solver() {
		String a="CODEFESTIVAL2016";
		String s=ns();
		int ans=0;
		for(int i=0;i<s.length();i++){
System.out.println("[INST]20;None;s.length();"+s.length());
			if(a.charAt(i)!=s.charAt(i))ans++;
System.out.println("[INST]21;None;a.charAt(i);"+a.charAt(i));
System.out.println("[INST]21;None;s.charAt(i);"+s.charAt(i));
		}
		out.println(ans);
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]27;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]27;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver();
		out.flush();
System.out.println("[INST]30;None;out.flush();"+out.flush());

	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
System.out.println("[INST]38;num;is.read();"+num);
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
System.out.println("[INST]48;b;is.read();"+b);
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
System.out.println("[INST]87;b;is.read();"+b);
				if (b == -1)
					return sb.toString();
System.out.println("[INST]89;None;sb.toString();"+sb.toString());
				if (b <= ' ')
					return sb.toString();
System.out.println("[INST]91;None;sb.toString();"+sb.toString());
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
System.out.println("[INST]107;b;is.read();"+b);
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
System.out.println("[INST]112;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
System.out.println("[INST]124;None;is.read(buf);"+is.read(buf));
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
System.out.println("[INST]133;b;is.read();"+b);
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
System.out.println("[INST]140;None;is.mark(1000);"+is.mark(1000));
			int b = skip();
			is.reset();
System.out.println("[INST]142;None;is.reset();"+is.reset());
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
System.out.println("[INST]153;num;is.read();"+num);
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
System.out.println("[INST]163;b;is.read();"+b);
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
