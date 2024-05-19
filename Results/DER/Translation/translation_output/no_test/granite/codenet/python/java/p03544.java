System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] memo = new int[N + 1];
        memo[0] = 2;
        memo[1] = 1;
        for (int i = 2; i <= N; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        System.out.println(memo[N]);
    }
}
```<|endoftext|>
