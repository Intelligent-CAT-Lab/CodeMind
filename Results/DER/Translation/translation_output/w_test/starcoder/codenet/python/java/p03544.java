<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
11


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

java code:<fim_suffix><fim_middle>
```
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        System.out.println(memo[n]);
    }
}
```

'''
<|endoftext|>
