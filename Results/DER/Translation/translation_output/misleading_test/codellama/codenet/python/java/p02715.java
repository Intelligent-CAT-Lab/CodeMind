<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-82

```
N, K = map(int, input().split())
P = 10 ** 9 + 7
X = [0] * (K + 1)
ans = 0
for i in range(1, K + 1):
    X[i] += i
    for j in range(i * 2, K+1, i):
        X[j] -= X[i]
    ans += X[i] * pow(K//i, N, P)
print(ans % P)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = 1000000007;
        int[] X = new int[K + 1];
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * (int) Math.pow(K / i, N) % P;
        }
        System.out.println(ans % P);
    }
}
```
This code uses the same approach as the Python code, but it is written in Java. It first reads in the input values `N` and `K` from the user, and then it initializes an array `X` of size `K + 1` and sets the first element to `0`. It then iterates over the range `1` to `K` and for each value `i`, it updates the value of `X[i]` and then iterates over the range `i * 2` to `K` in steps of `i` and updates the value of `X[j]` for each `j`. Finally, it calculates the sum of the products of `X[i]` and `(K / i) ^ N` and prints the result modulo `P`.</s>
