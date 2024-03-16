<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input = sys.stdin.readline

n, k = [int(x) for x in input().split()]

n_k = n // k
n_mod_k = n % k

def mod_k(x):
    res = n_k
    if x != 0 and x <= n_mod_k:
        res += 1
    elif x == 0 and n_mod_k == k:
        res += 1
    return res

ans = 0

for i in range(k):
    a_mod = i
    b_mod = -i % k
    c_mod = -i % k
    if (b_mod +c_mod) % k == 0:
        ans += mod_k(a_mod) * mod_k(b_mod) * mod_k(c_mod)

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int n_k = n / k;
        int n_mod_k = n % k;

        long ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = -i % k;
            int c_mod = -i % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k(n_k, n_mod_k, a_mod) * mod_k(n_k, n_mod_k, b_mod) * mod_k(n_k, n_mod_k, c_mod);
            }
        }

        System.out.println(ans);
    }

    public static long mod_k(int n_k, int n_mod_k, int x) {
        long res = n_k;
        if (x != 0 && x <= n_mod_k) {
            res += 1;
        } else if (x == 0 && n_mod_k == k) {
            res += 1;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the integer division and modulus, and then uses a loop to calculate the answer. The `mod_k` function is also defined in the same way as in the Python code.
<|EOT|>
