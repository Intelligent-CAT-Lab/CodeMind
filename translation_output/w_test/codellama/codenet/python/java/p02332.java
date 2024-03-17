<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6


```
N, K = map(int, input().split())
MOD = 10**9 + 7

if K < N:
    print(0)
else:
    ans = 1
    for v in range(K, K-N, -1):
        ans = ans * v % MOD
    print(ans)


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        if (K < N) {
            System.out.println(0);
        } else {
            long ans = 1;
            for (int v = K; v >= K - N; v--) {
                ans = (ans * v) % MOD;
            }
            System.out.println(ans);
        }
    }
}
```

Note: The code uses the `Scanner` class to read input from the user, and the `long` data type to store the result of the calculation. The `MOD` variable is used to store the value of 10^9 + 7, which is the modulus used in the calculation. The `if` statement is used to check if `K` is less than `N`, and if it is, the program prints 0. Otherwise, it calculates the result using the `for` loop and prints it.</s>
