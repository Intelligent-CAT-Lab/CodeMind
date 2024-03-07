<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N, K = map(int, input().split())
MOD = 10**9 + 7

if K < N:
    print(0)
else:
    ans = 1
    for v in range(K, K-N, -1):
        ans = ans * v % MOD
    print(ans)



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
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
Note that in Java, the `long` data type is used to store the result of the multiplication, since the result can be larger than the maximum value of an `int`. Also, the `%` operator is used to perform the modulo operation, which is equivalent to the `mod` function in Python.</s>
