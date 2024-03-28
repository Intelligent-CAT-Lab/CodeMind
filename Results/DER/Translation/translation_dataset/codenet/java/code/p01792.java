import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class p01792 {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		// PrintWriter pwriter = new PrintWriter(System.out);
		do {
			int p = scan.nextInt();
			int m = scan.nextInt();
			int n = scan.nextInt();
			Casino casino = new Casino(debug);
			casino.printProb(p, m, n);
		} while (debug);

		scan.close();
		System.exit(0);
	}
}

class Casino {
	boolean debug;

	public Casino(boolean debug) {
		this.debug = debug;
	}

	public void printProb(int p, int m, int n) {
		// if p is 0% or 100%, the probability are same for any bets.
		// and if p is 50%, bet amount must not be greater than m when succeed.
		if (p == 0) {
			System.out.println(0d);
			printBet(m);
		} else if (p == 50) {
			// we can get same answer
			if (debug)
				System.out.println("debug\n" + getProbLarge(p / 100d, m, n));
			System.out.println((double) m / n);
			printBet(Math.min(m, n - m));
		} else if (p == 100) {
			System.out.println(1d);
			printBet(m);
		} else if (p > 50) {
			System.out.println(getProbLarge(p / 100d, m, n));
			System.out.println("1");
			System.out.println("1");
		} else {
			printProbSmall(p / 100d, m, n);
		}
	}

	private void printBet(int m) {
		System.out.println(m);
		System.out.print("1");
		if (m <= 200)
			for (int i = 2; i <= m; i++)
				System.out.print(" " + i);
		else {
			for (int i = 2; i <= 100; i++)
				System.out.print(" " + i);
			for (int i = m - 100 + 1; i <= m; i++)
				System.out.print(" " + i);
		}
		System.out.println();
	}

	private void printProbSmall(double p, int m, int n) {
		Prob pb = new Prob(p, n);
		double hi = pb.getProbSmall(m, 1d);
		System.out.println(hi);
		if (debug) {
			// if we check all bet pattern, it can not end for larger m value
			// within CPU time limits.
			// This statement is only for check the result.
			int[] bet = new int[100];
			int cnt = 0;
			for (int i = 1; i <= m; i++)
				if (Math.abs(p * pb.getProbSmall(m + i, 1d) + (1d - p) * pb.getProbSmall(m - i, 1d) - hi) < Math
						.pow(0.1, 10)) {
					bet[cnt++] = i;
				}
			System.out.println("debug\n" + cnt);
			System.out.print(bet[0]);
			for (int i = 1; i < cnt; i++)
				System.out.print(" " + bet[i]);
			System.out.println();
		}

		int[] bet = new int[100];
		setFirstBet(bet, 0, m, 0, n);

		Arrays.sort(bet);
		int cnt = 0;
		for (int i = 1; i < bet.length; i++)
			if (bet[i] > 0 && bet[i] != bet[i - 1])
				bet[cnt++] = bet[i];
		System.out.println(cnt);
		System.out.print(bet[0]);
		for (int i = 1; i < cnt; i++)
			System.out.print(" " + bet[i]);
		System.out.println();
	}

	private void setFirstBet(int[] bet, int cnt, int m, int min, int max) {
		// one of the best bet value is all m when m is less than half of n
		// otherwise n-m. It's just get the n.
		//
		// In case of m is less than half of n, other bet is same probability.
		//
		// for example m is 3, n is 8
		// success bet 3 , and success or fail at second bet 2, continue..
		// f(3) = p*f(6) = p*{p + (1-p)*f(4)} = pp + p(1-p)f(4)
		// success or fail first bet 1, and second bet is all
		// f(3) = p*f(4) + (1-p)*f(2) = p*f(4) + (1-p)*p*f(4) = same
		//
		// In case of m is greater than half of n
		// fail at first bet, then remain just half of n, is same probability.
		//
		// I can not prove this rule more exactly,
		// but it can recursively true
		//
		bet[cnt++] = Math.min(m - min, max - m);
		if (max > min && (max + min) % 2 == 0) {
			if ((max + min) / 2 > m)
				max = (max + min) / 2;
			else
				min = (max + min) / 2;
			setFirstBet(bet, cnt, m, min, max);
		}

	}

	class Prob {
		int n;
		double p;

		public Prob(double p, int n) {
			this.p = p;
			this.n = n;
		}

		public double getProbSmall(int m, double ps) {
			// If p is less than 50 percents, best selection is to minimize the
			// try count.
			// When we have m, and m is less than n/2, bet all m
			// Otherwise bet (n - m) and just get n when success.
			//
			// This function repeatedly call with same value, for example
			// when we have m = 2 and goal n = 3
			// f(2) = p + (1-p)*f(1) = p + (1-p)*p*f(2) = p + (1-p)*p*{ p +
			// (1-p)*f(1) } = ...
			//
			// it means if fail at first bet f(2) call f(1), and succeed in
			// second bet f(1) call f(2) ...
			// Then keep dependency of sub call as 'ps', and if it saturate to
			// zero percent, terminate the sub call
			//
			if (m >= n)
				return 1d;
			if (m <= 0)
				return 0d;

			if (ps < Math.pow(0.1, 15))
				return 0d;

			double x = 1d;
			if (2 * m <= n)
				x = p * getProbSmall(2 * m, ps * p);
			else
				x = p + (1d - p) * getProbSmall(2 * m - n, ps * (1d - p));

			return x;
		}
	}

	private double getProbLarge(double p, int m, int n) {
		// if p is greater than 50 percent, bet 1 by 1 is best selection
		//
		// probability to increase m to n is represented as f(m,n), then
		// --- f(m,n) = f(m,m+1) * f(m+1,n)
		// --- = f(m,m+1) * f(m+1,m+2) * (f(m+2,m+3) * ..... * f(n-1,n)
		//
		// and
		// --- f(m,m+1) = p + (1-p) * f(m-1,m) * f(m,m+1)
		// bet 1 and success, that probability is p, and probability of fail is
		// (1-p). if fail, retry increase m-1 to m, and m to m+1
		//
		// --- f(m,m+1) = p / ( 1 - (1-p) * f(m-1,m) )
		// --- f(0,1) = 0, f(1,2) = p;
		//
		// additionally f(m,m+1) saturate to 100 percent at large m value
		// when p is 51 percent, f(1000,1001), f(1001,1002),... are saturated to
		// 100 percent
		// no need to calculate
		if (m > 1000)
			return 1d;
		if (n > 1000)
			n = 1000;
		double[] f = new double[n];
		// f[m] means f(m,m+1)
		f[0] = 0;
		double pf = 1 - p;
		for (int i = 1; i < n; i++)
			f[i] = p / (1 - pf * f[i - 1]);

		if (debug)
			for (int i = 1; i < n && f[i - 1] != f[i]; i++)
				System.out.println("f(" + i + ") = " + f[i]);

		double result = 1d;
		for (int i = m; i < n; i++)
			result *= f[i];

		return result;
	}
}

class UserScanner {
	private InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public UserScanner(InputStream inStream) {
		in = inStream;
	}

	private void read() {
		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	private byte getByte() {
		if (ptr >= buflen)
			read();
		if (buflen < 0 || isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() {
		for (; ptr < buflen; ptr++)
			if (!isCtlSpace(buffer[ptr]))
				return;
		read();
		skipCtlSpace();
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	public String next() {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public long nextLong() {
		skipCtlSpace();
		long n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10d;
				n += (long) (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}

	public int nextInt() {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}