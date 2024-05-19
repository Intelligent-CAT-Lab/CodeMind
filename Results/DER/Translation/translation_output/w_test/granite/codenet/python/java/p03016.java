System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 4 10007

Expected output:
5563


```
import numpy as np


def exp_np(a, e, m):
    r = np.identity(a.shape[0], dtype=np.int64)
    t = a.copy()
    while e:
        if e % 2:
            r = np.dot(r, t) % m
        t = np.dot(t, t) % m
        e >>= 1
    return r


l, a, b, m = map(int, input().split())

first_d = len(str(a))
tail = a + b * (l - 1)

lo = -1
state = np.array([[0, a % m, 1]])

for d in range(first_d, 19):
    hi = min((10 ** d - 1 - a) // b, l - 1)
    cnt = hi - lo
    coe = np.array([
        [pow(10, d, m), 0, 0],
        [1, 1, 0],
        [0, b % m, 1]
    ], dtype=np.int64)

    coe = exp_np(coe, cnt, m)
    state = np.dot(state, coe) % m

    lo = hi
    if hi == l - 1:
        break

print(state[0][0])

```


Answer:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int first_d = (int)Math.floor(Math.log10(a)) + 1;
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = {{0, a % m, 1}};

        for (int d = first_d; d <= 18; d++) {
            int hi = Math.min((int)Math.floor((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;
            int[][] coe = {{(int)Math.pow(10, d) % m, 0, 0}, {1, 1, 0}, {0, b % m, 1}};

            coe = matrix_power(coe, cnt, m);
            state = matrix_multiply(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static int[][] matrix_multiply(int[][] a, int[][] b, int m) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] = (result[i][j] + a[i][k] * b[k][j]) % m;
                }
            }
        }
        return result;
    }

    public static int[][] matrix_power(int[][] a, int n, int m) {
        if (n == 1) {
            return a;
        }
        int[][] result = matrix_power(a, n / 2, m);
        result = matrix_multiply(result, result, m);
        if (n % 2 == 1) {
            result = matrix_multiply(result, a, m);
        }
        return result;
    }
}<|endoftext|>
