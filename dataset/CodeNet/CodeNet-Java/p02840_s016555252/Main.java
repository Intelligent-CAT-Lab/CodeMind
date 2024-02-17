
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long D = sc.nextLong();
		System.out.println(solve(N, X, D));
//		for (long n = 1; n < 10; ++n) {
//			for (long x = -10; x <= 10; ++x) {
//				for (long d = -10; d <= 10; ++d) {
//					if (solve(n, x, d) != exact(n, x, d)) {
//						tr(n, x, d, solve(n, x, d), exact(n, x, d));
//						return;
//					}
//				}
//			}
//		}
	}

	long exact(long N, long X, long D) {
		long[] A = new long[(int) N];
		A[0] = X;
		for (int i = 1; i < A.length; ++i) {
			A[i] = A[i - 1] + D;
		}
		HashSet<Long> set = new HashSet<Long>();
		for (int s = 0; s < 1 << N; ++s) {
			long sum = 0;
			for (int shift = 0; shift < N; ++shift) {
				if ((s >> shift) % 2 == 1) {
					sum += A[shift];
				}
			}
			set.add(sum);
		}
		return set.size();
	}

	long solve(long N, long X, long D) {
		if (D < 0) {
			X *= -1;
			D *= -1;
		} else if (D == 0) {
			if (X == 0) {
				return 1;
			} else {
				return N + 1;
			}
		}
		HashSet<Long> set = new HashSet<>();
		for (int i = 1; i <= N; ++i) {
			set.add(((X * i % D) + D) % D);
		}
		set.add(0L);
		long[] id = new long[set.size()];
		int p = 0;
		for (long v : set) {
			id[p++] = v;
		}
		Arrays.sort(id);
		PriorityQueue<long[]>[] pq = new PriorityQueue[set.size()];
		for (int i = 0; i < pq.length; ++i) {
			pq[i] = new PriorityQueue<long[]>(new Comparator<long[]>() {
				@Override
				public int compare(long[] o1, long[] o2) {
					if (o1[0] != o2[0]) {
						return Long.compare(o1[0], o2[0]); // start, end
					} else {
						return Long.compare(o1[1], o2[1]);
					}
				}
			});
		}
		long ans = 0;
		for (long i = 1; i <= N; ++i) {
			long mod = (X * i % D + D) % D;
			int idx = Arrays.binarySearch(id, mod);
			if (idx < 0)
				throw new AssertionError();
			long start = i * (i - 1) / 2;// 0+1+...+i-1=(1/2)i(i-1)
			long end = N * i - i * (i + 1) / 2;// (n-i)...+(n-2)+(n-1)=ni-i(i+1)/2
			pq[idx].add(new long[] { start * D + X * i, end * D + X * i });
		}
		pq[0].add(new long[] { 0, 0 });
		for (int i = 0; i < pq.length; ++i) {
			while (!pq[i].isEmpty()) {
				long[] a = pq[i].poll();
				while (!pq[i].isEmpty() && a[1] >= pq[i].peek()[0]) {
					if (a[1] > pq[i].peek()[1]) {
						pq[i].poll();
					} else {
						long[] b = pq[i].poll();
						a[1] = b[1];
					}
				}
				ans += (a[1] - a[0] + D) / D;
			}
		}
		return ans;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
