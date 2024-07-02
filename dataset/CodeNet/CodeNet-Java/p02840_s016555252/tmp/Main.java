
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
System.out.println("[INST]14;N;sc.nextLong();"+N);
		long X = sc.nextLong();
System.out.println("[INST]15;X;sc.nextLong();"+X);
		long D = sc.nextLong();
System.out.println("[INST]16;D;sc.nextLong();"+D);
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
System.out.println("[INST]44;None;set.add(sum);"+set.add(sum));
		}
		return set.size();
System.out.println("[INST]46;None;set.size();"+set.size());
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
System.out.println("[INST]62;None;set.add(((X * i % D) + D) % D);"+set.add(((X * i % D) + D) % D));
		}
		set.add(0L);
System.out.println("[INST]64;None;set.add(0L);"+set.add(0L));
		long[] id = new long[set.size()];
System.out.println("[INST]65;None;set.size();"+set.size());
		int p = 0;
		for (long v : set) {
			id[p++] = v;
		}
		Arrays.sort(id);
System.out.println("[INST]70;None;Arrays.sort(id);"+Arrays.sort(id));
		PriorityQueue<long[]>[] pq = new PriorityQueue[set.size()];
System.out.println("[INST]71;None;set.size();"+set.size());
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
System.out.println("[INST]87;idx;Arrays.binarySearch(id, mod);"+idx);
			if (idx < 0)
				throw new AssertionError();
			long start = i * (i - 1) / 2;// 0+1+...+i-1=(1/2)i(i-1)
			long end = N * i - i * (i + 1) / 2;// (n-i)...+(n-2)+(n-1)=ni-i(i+1)/2
			pq[idx].add(new long[] { start * D + X * i, end * D + X * i });
System.out.println("[INST]92;None;pq[idx].add(new long[] { start * D + X * i, end * D + X * i });"+pq[idx].add(new long[] { start * D + X * i, end * D + X * i }));
		}
		pq[0].add(new long[] { 0, 0 });
System.out.println("[INST]94;None;pq[0].add(new long[] { 0, 0 });"+pq[0].add(new long[] { 0, 0 }));
		for (int i = 0; i < pq.length; ++i) {
			while (!pq[i].isEmpty()) {
System.out.println("[INST]96;None;pq[i].isEmpty();"+pq[i].isEmpty());
				long[] a = pq[i].poll();
System.out.println("[INST]97;a;pq[i].poll();"+a);
				while (!pq[i].isEmpty() && a[1] >= pq[i].peek()[0]) {
System.out.println("[INST]98;None;pq[i].isEmpty();"+pq[i].isEmpty());
System.out.println("[INST]98;None;pq[i].peek();"+pq[i].peek());
					if (a[1] > pq[i].peek()[1]) {
System.out.println("[INST]99;None;pq[i].peek();"+pq[i].peek());
						pq[i].poll();
System.out.println("[INST]100;None;pq[i].poll();"+pq[i].poll());
					} else {
						long[] b = pq[i].poll();
System.out.println("[INST]102;b;pq[i].poll();"+b);
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
