<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
17

```
def fib(n):
    memo = [0] * n
    memo[0:2] = [2, 1]
    for i in range(2, n):
        memo[i] = memo[i - 1] + memo[i - 2]
    return memo[n - 1]


def solve():
    N = int(input())
    print(fib(N + 1))
    

solve()
```
[/INST]
```java
import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        int[] memo = new int[n];
        memo[0] = 2;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fib(N + 1));
    }
}
```</s>
