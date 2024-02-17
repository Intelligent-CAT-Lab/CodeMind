import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<Long> l = new HashSet<>();
		long j = s.nextLong();
		long k = j - 1;

		for (long i = 2; i * i <= j; ++i) {
			if (j % i == 0) {
				f(i, j, l);
				f(j / i, j, l);
			}

			if (k % i == 0) {
				f(i, j, l);
				f(k / i, j, l);
			}
		}
		System.out.println(j <= 3 ? j - 1 : l.size() + 2);
	}

	private static void f(long i, long k, HashSet<Long> l) {
		while (k % i == 0) {
			k /= i;
		}
		if (k % i == 1)
			l.add(i);
	}
}
