<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N, K = map(int, input().split())
count = 0

for i in range(K + 1, N + 1):
    count += ((N + 1) // i) * (i - K) + max(0, (N + 1) % i - K)

if K == 0:
    count -= len(range(K + 1, N + 1))

print (count)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;

        for (int i = K + 1; i <= N; i++) {
            count += (N / i) * (i - K) + Math.max(0, N % i - K);
        }

        if (K == 0) {
            count -= (N - K);
        }

        System.out.println(count);
    }
}
```
This is the Java code equivalent to the Python code. It uses the `Scanner` class to read the input from the user, and the `Math.max()` method to calculate the maximum value of two numbers. The `Math.max()` method is used to ensure that the result is non-negative.

Note that the `N / i` expression in the Python code is equivalent to `N.div(i)` in Java, and the `N % i` expression is equivalent to `N.mod(i)` in Java.</s>
