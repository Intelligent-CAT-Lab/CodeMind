import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

public class Main {
	public static long MOD = 1000000007;

	// calcurate n^k
	public static long pow(long n, long k) {
		long ans = 1;
		long tmp = n;
		while(true) {
			if(k==0) {
				return ans;
			}
			if(k % 2 == 1) {
				ans = (ans * tmp) % MOD;
			}
			tmp = (tmp * tmp) % MOD;
			k /= 2;
		}
	}

	public static ArrayList<Integer> divisors(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i*i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
System.out.println("[INST]29;None;list.add(i);"+list.add(i));
				if(i != n/i) list.add(n/i);
System.out.println("[INST]30;None;list.add(n/i);"+list.add(n/i));
			}
		}
		Collections.sort(list);
System.out.println("[INST]33;None;Collections.sort(list);"+Collections.sort(list));
		return list;
	}

	public static void main(String[] args) {
		FS r = new FS();
		int N = r.nextInt();
		int K = r.nextInt();
		ArrayList<Integer> divisor = divisors(N);
		long[] num = new long[divisor.size()];
System.out.println("[INST]42;None;divisor.size();"+divisor.size());
		long tmpSum = 0;
		for(int i=0; i<divisor.size(); i++) {
System.out.println("[INST]44;None;divisor.size();"+divisor.size());
			num[i] = pow(K, (divisor.get(i)+1)/2);
System.out.println("[INST]45;None;divisor.get(i);"+divisor.get(i));
			for(int j=0; j<i; j++) {
				if(divisor.get(i) % divisor.get(j) == 0) {
System.out.println("[INST]47;None;divisor.get(i);"+divisor.get(i));
System.out.println("[INST]47;None;divisor.get(j);"+divisor.get(j));
					num[i] -= num[j];
				}
			}
			while(num[i]<0) num[i] += MOD;
			tmpSum += num[i];
			tmpSum %= MOD;
		}
		long ans = 0;
		for(int i=0; i<divisor.size(); i++) {
System.out.println("[INST]56;None;divisor.size();"+divisor.size());
			if(num[i]<0) num[i] += MOD;
			num[i] = num[i] % MOD;
		}
		for(int i=0; i<divisor.size(); i++) {
System.out.println("[INST]60;None;divisor.size();"+divisor.size());
			long d = (long)divisor.get(i);
System.out.println("[INST]61;None;divisor.get(i);"+divisor.get(i));
			if(d%2==0) ans += num[i]*d/2;
			else ans += num[i]*d;
			ans = ans % MOD;
		}
		System.out.println(ans);
	}

	// Read Class
	static class FS {
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
System.out.println("[INST]81;buflen;in.read(buffer);"+buflen);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
System.out.println("[INST]102;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
				b = readByte();
			}
			return sb.toString();
System.out.println("[INST]105;None;sb.toString();"+sb.toString());
		}
		public int nextInt() {
			return (int)nextLong();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
