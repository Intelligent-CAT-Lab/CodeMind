import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		int N = S.length;
		int[] next = new int[N];
		int[] prev = new int[N];
		int[] start = new int[26];
		int[] end = new int[26];
		Arrays.fill(next, -1);
		Arrays.fill(prev, -1);
		Arrays.fill(start, -1);
		Arrays.fill(end, -1);
		for (int i = 0; i < N; ++i) {
			int ch = S[i] - 'a';
			if (end[ch] == -1) {
				start[ch] = i;
			} else {
				next[end[ch]] = i;
			}
			prev[i] = end[ch];
			end[ch] = i;
		}
		BIT bit = new BIT(N);
		long ans = 0;
		for (int i = 0; i < N / 2; ++i) {
			long min = 1 << 28;
			int mi = -1;
			for (int j = 0; j < 26; ++j) {
				if (start[j] == -1) continue;
				if (start[j] == end[j]) {
					System.out.println(-1);
					return;
				}
				long count = start[j] - bit.sum(1, start[j] + 1);
				count += (N - end[j] - 1) - bit.sum(end[j] + 1, N);
				if (count < min) {
					min = count;
					mi = j;
				}
			}
			if (mi == -1) {
				System.out.println(-1);
				return;
			}
			ans += min;
			bit.add(start[mi] + 1, 1);
			bit.add(end[mi] + 1, 1);
			if (next[start[mi]] == end[mi]) {
				next[start[mi]] = -1;
				prev[end[mi]] = -1;
				start[mi] = end[mi] = -1;
			} else {
				prev[next[start[mi]]] = -1;
				start[mi] = next[start[mi]];
				next[prev[end[mi]]] = -1;
				end[mi] = prev[end[mi]];
			}
		}
		System.out.println(ans);
	}

	static class BIT {
		long[] v;

		BIT(int size) {
			int len = 1;
			while (len < size) {
				len *= 2;
			}
			this.v = new long[len + 1];
		}

		long cumulativeSum(int index) {
			long ret = 0;
			while (index > 0) {
				ret += v[index];
				index &= index - 1;
			}
			return ret;
		}

		// inclusive, 1-indexed
		long sum(int l, int r) {
			long ret = cumulativeSum(r) - cumulativeSum(l - 1);
			return ret;
		}

		void add(int index, long val) {
			while (index < v.length) {
				v[index] += val;
				index += (index & -index);
			}
		}

		void set(int index, long val) {
			long old = sum(index, index);
			add(index, val - old);
		}
	}

}