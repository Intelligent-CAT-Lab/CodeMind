<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
9


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
```
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
This is the Java code for the given Python code. The code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of a number. The `P` variable is used to store the value of 10^9 + 7, which is used as the modulus for the calculations. The `X` array is used to store the values of the `X[i]` variables, and the `ans` variable is used to store the final result. The code loops through each `i` from 1 to `K`, calculates the value of `X[i]`, and updates the `X[j]` values for each `j` that is a multiple of `i`. The code then calculates the final result by summing up the values of `X[i] * pow(K/i, N) % P` for each `i` from 1 to `K`. Finally, the code prints the final result modulo `P`.</s>
