<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p01491 {
	public static void main(String[] args) {
		new p01491().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int m0 = sc.nextInt();
		int md = sc.nextInt();
		int n0 = sc.nextInt();
		int nd = sc.nextInt();
		int[] m = new int[M];
		int[] n = new int[N];
		m[0] = m0;
		n[0] = n0;

		for (int i = 1; i < M; ++i) {
			m[i] = (m[i - 1] * 58 + md) % (N + 1);
		}
		for (int i = 1; i < N; ++i) {
			n[i] = (n[i - 1] * 58 + nd) % (M + 1);
		}

		m = sort(m, N);
		n = sort(n, M);
		
		long[] accumN = new long[N + 1];
		long[] accumM = new long[M + 1];
		for (int i = 0; i < N; ++i) {
			accumN[i + 1] = accumN[i] + n[i];
		}
		for (int i = 0; i < M; ++i) {
			accumM[i + 1] = accumM[i] + m[i];
		}
		
		int cur = N;
		long sum = accumM[0] + accumN[cur] + (N - cur) * (M - 0);
		for (int i = 0; i <= M; ++i) {
			while (cur >= 1 && accumM[i] + accumN[cur] + (long)(N - cur) * (M - i) >= accumM[i] + accumN[cur - 1]
					+ (long)(N - (cur - 1)) *(M - i))
				--cur;
			sum = Math.min(sum, accumM[i] + accumN[cur] + (long)(N - cur) * (M - i));
		}
		
		System.out.println(sum);
		sc.close();
	}

	int[] sort(int[] a, int max) {
		int[] counter = new int[max + 1];
		for (int i = 0; i < a.length; ++i) {
			counter[a[i]]++;
		}
		int pos = 0;
		for (int i = 0; i < counter.length; ++i) {
			while (counter[i]-- > 0) {
				a[pos++] = i;
			}
		}
		return a;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
```
[/INST]
```python
import sys

def p01491():
    M, N = map(int, sys.stdin.readline().split())
    m0, md, n0, nd = map(int, sys.stdin.readline().split())
    m = [0] * M
    n = [0] * N
    m[0] = m0
    n[0] = n0
    for i in range(1, M):
        m[i] = (m[i-1] * 58 + md) % (N + 1)
    for i in range(1, N):
        n[i] = (n[i-1] * 58 + nd) % (M + 1)
    m = sorted(m)
    n = sorted(n)
    accumN = [0] * (N+1)
    accumM = [0] * (M+1)
    for i in range(N):
        accumN[i+1] = accumN[i] + n[i]
    for i in range(M):
        accumM[i+1] = accumM[i] + m[i]
    cur = N
    sum = accumM[0] + accumN[cur] + (N - cur) * (M - 0)
    for i in range(M+1):
        while cur >= 1 and accumM[i] + accumN[cur] + (N - cur) * (M - i) >= accumM[i] + accumN[cur-1] + (N - (cur - 1)) * (M - i):
            cur -= 1
        sum = min(sum, accumM[i] + accumN[cur] + (N - cur) * (M - i))
    print(sum)

if __name__ == "__main__":
    p01491()
```</s>
