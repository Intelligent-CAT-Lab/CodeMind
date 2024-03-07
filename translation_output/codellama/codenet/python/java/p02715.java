<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

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
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of `K/i` to the `N`th power. The `ans` variable is used to store the final result, and the `System.out.println()` method is used to print the result.

Note that the `P` variable is used to represent the modulus, and the `%` operator is used to perform the modulo operation. This is necessary because the `Math.pow()` method returns a floating-point number, and we need to convert it to an integer before performing the modulo operation.</s>
