import java.util.Scanner;

public class p02059 {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 998244353;

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		int N = S.length;
		long[] pow3 = new long[N + 1];
		pow3[0] = 1;
		for (int i = 0; i < N; i++) {
			pow3[i + 1] = pow3[i] * 3 % MOD;
		}
		Bits bsf1 = new Bits(N + 64);
		Bits bsf2 = new Bits(N + 64);
		Bits bsb1 = new Bits(N + 64);
		Bits bsb2 = new Bits(N + 64);
		int Q = 0;
		for (int i = 0; i < N; i++) {
			if (S[i] == 'G') {
				bsf1.set(i);
			} else if (S[i] == '?') {
				bsf2.set(i);
				Q++;
			}
			if (S[N - 1 - i] == 'U') {
				bsb1.set(i);
			} else if (S[N - 1 - i] == '?') {
				bsb2.set(i);
			}
		}
		long ans = 0;
		long[] buff1 = new long[bsf1.bits.length];
		long[] buff2 = new long[bsf1.bits.length];
		long[] bufb1 = new long[bsf2.bits.length];
		long[] bufb2 = new long[bsf2.bits.length];
		for (int i = 1; i < N - 1; i++) {
			if (S[i] == 'M' || S[i] == '?') {
				int q = S[i] == 'M' ? Q : Q - 1;
				bsf1.copy(buff1, i + 1);
				bsf2.copy(buff2, i + 1);
				bsb1.copy(bufb1, N - i);
				bsb2.copy(bufb2, N - i);
				int len = (Math.min(N - 1 - i, i) + 63) / 64;
				for (int j = 0; j < len; j++) {
					ans += Long.bitCount(buff1[j] & bufb1[j]) * pow3[q];
					if (q >= 1) {
						ans += Long.bitCount(buff1[j] & bufb2[j]) * pow3[q - 1];
						ans += Long.bitCount(buff2[j] & bufb1[j]) * pow3[q - 1];
					}
					if (q >= 2) {
						ans += Long.bitCount(buff2[j] & bufb2[j]) * pow3[q - 2];
					}
				}
				ans %= MOD;
			}
		}
		System.out.println(ans);
	}

	static class Bits {
		long[] bits;

		Bits(int size) {
			bits = new long[(size + 63) / 64];
		}

		void copy(long[] buf, int from) {
			int start = from >> 6;
			int rem = from & 63;
			if (rem == 0) {
				for (int i = start; i < bits.length; i++) {
					buf[i - start] = bits[i];
				}
			} else {
				for (int i = start; i < bits.length; i++) {
					buf[i - start] = bits[i] >>> rem;
					if (i < bits.length - 1) {
						buf[i - start] |= bits[i + 1] << (64 - rem);
					}
				}
			}
			if (start > 0) buf[bits.length - start] = 0;
		}

		void shiftLOr(int shift) {
			int m1 = shift >> 6;
			int m2 = shift & 63;
			if (m2 == 0) {
				for (int i = bits.length - 1 - m1; i >= 0; i--) {
					bits[i + m1] |= bits[i];
				}
			} else {
				for (int i = bits.length - 1 - m1; i >= 0; i--) {
					int p1 = i + m1 + 1;
					int p2 = i + m1;
					long v1 = bits[i] >>> (64 - m2);
					long v2 = bits[i] << m2;
					if (p1 < bits.length) {
						bits[p1] |= v1;
					}
					bits[p2] |= v2;
				}
			}
		}

		boolean get(int pos) {
			return ((bits[pos >> 6] >>> (pos & 63)) & 1) != 0;
		}

		void set(int pos) {
			bits[pos >> 6] |= (1L << (pos & 63));
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bits.length; i++) {
				sb.append(Long.toString(bits[i], 16));
				sb.append(',');
			}
			return sb.toString();
		}
	}
}

