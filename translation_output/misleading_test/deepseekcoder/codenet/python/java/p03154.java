<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
-22

```
MOD = 10**9 + 7
list_size = 20000001

f_list = [1] * list_size
f_r_list = [1] * list_size

for i in range(list_size-1):
	f_list[i+1] = (f_list[i] * (i+1)) % MOD

f_r_list[-1] = pow(f_list[-1], MOD - 2, MOD)

for i in range(list_size-2, -1, -1):
	f_r_list[i] = (f_r_list[i+1] * (i+1)) % MOD

h, w, k = map(int, input().split())
ans = k * f_list[h+w] * f_r_list[h+w-k]
ans += (h+w) * k * (k+1) * f_list[h+w-1] * f_r_list[2] * f_r_list[h+w-k]
ans %= MOD
ans += h * w * f_list[h+w-2] * (k-1) * k * (k+1) * pow(3, MOD-2, MOD) * f_r_list[h+w-k]
ans %= MOD
print(ans)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final long MOD = (long)Math.pow(10, 9) + 7;
    static final int listSize = 20000001;

    static long[] fList = new long[listSize];
    static long[] fRList = new long[listSize];

    public static void main(String[] args) {
        for (int i = 0; i < listSize; i++) {
            fList[i] = 1;
            fRList[i] = 1;
        }

        for (int i = 1; i < listSize; i++) {
            fList[i] = (fList[i-1] * i) % MOD;
        }

        fRList[listSize-1] = pow(fList[listSize-1], MOD - 2);

        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i+1] * (i+1)) % MOD;
        }

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        long ans = k * fList[h+w] % MOD * fRList[h+w-k] % MOD;
        ans += (h+w) * k * (k+1) % MOD * fList[h+w-1] % MOD * fRList[2] % MOD * fRList[h+w-k] % MOD;
        ans %= MOD;
        ans += h * w % MOD * fList[h+w-2] % MOD * (k-1) * k * (k+1) % MOD * pow(3, MOD-2) % MOD * fRList[h+w-k] % MOD;
        ans %= MOD;

        System.out.println(ans);
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
```

This Java code does the same thing as your Python code. It calculates the number of ways to choose k elements from a set of h+w elements, where the order of selection matters. The calculation is done using the formula for combinations with repetition, which is a generalization of the binomial coefficient formula. The result is then printed to the standard output.
<|EOT|>
