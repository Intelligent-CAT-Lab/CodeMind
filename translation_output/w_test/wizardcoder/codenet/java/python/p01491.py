Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 3 1 0

Expected output:
2


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

### Response:
```python
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
```<|endoftext|>
