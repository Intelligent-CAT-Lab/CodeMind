System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 4 10007

Expected output:
5556

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

            int[][] result = matrix_power(coe, cnt, m);
            state = matrix_multiply(state, result, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static int[][] matrix_power(int[][] matrix, int power, int mod) {
        int[][] result = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] temp = new int[matrix.length][matrix.length];

        while (power > 0) {
            if (power % 2 == 1) {
                temp = matrix_multiply(result, matrix, mod);
                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp.length; j++) {
                        result[i][j] = temp[i][j];
                    }
                }
            }
            temp = matrix_multiply(matrix, matrix, mod);
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    matrix[i][j] = temp[i][j];
                }
            }
            power /= 2;
        }

        return result;
    }

    public static int[][] matrix_multiply(int[][] matrix1, int[][] matrix2, int mod) {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                    result[i][j] %= mod;
                }
            }
        }

        return result;
    }
}
<|endoftext|>
