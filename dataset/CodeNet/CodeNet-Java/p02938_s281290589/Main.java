import java.util.*;

public class Main {
	Scanner sc;
	long L, R;
	
	private static long MOD = 1000000007L;
	private static final long[] MASK;
	static {
		MASK = new long[64];
		MASK[0] = 0L;
		for (int i = 1; i < 64; i++) MASK[i] = MASK[i-1] * 2 + 1;
	}
	private static final long[] POW3;
	static {
		POW3 = new long[64];
		POW3[0] = 1L;
		for (int i = 1; i < 64; i++) POW3[i] = (POW3[i-1] * 3L) % MOD;
	}
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		L = sc.nextLong();
		R = sc.nextLong();
		
		System.out.println(count(0, 0, 63));
		System.out.flush();
	}
	
	private long count(long x, long y, int maskn) {
		if ( (x|y) != 0 && (y>>>1) >= x) return 0L;
		if (R < x || R < y) return 0L;
		if ((y | MASK[maskn]) < L || (x | MASK[maskn]) < L) return 0L;
		if (L <= x && (y | MASK[maskn]) <= R) return POW3[maskn];
		maskn--;
		long nextBit = MASK[maskn]+1L;
		long su = count(x | nextBit, y | nextBit, maskn);
		long sl = count(x, y, maskn);
		if (x == y) return (su + sl + count(x, y | nextBit, maskn)) % MOD;
		else if ( L < x ) return (2 * su + sl) % MOD;
		else if ( (y | MASK[maskn+1]) < R) return (su + 2 * sl) % MOD;
		return (su + sl + count(x, y | nextBit, maskn)) % MOD;
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}