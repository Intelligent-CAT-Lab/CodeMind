<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
public class Fibonacci {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(fib(N + 1));
    }

    public static int fib(int n) {
        int[] memo = new int[n];
        memo[0] = 2;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }
}
```
This is a Java implementation of the Fibonacci sequence using a memoization technique. The `fib` function takes an integer `n` as input and returns the `n`th Fibonacci number. The `solve` function takes an integer `N` as input, calculates the `N`th Fibonacci number using the `fib` function, and prints the result.

The `fib` function uses a memoization technique to store the results of previous calculations. The `memo` array is initialized with the first two Fibonacci numbers (2 and 1) and then filled with the results of the recursive calculations. The `for` loop starts at `i = 2` and calculates the `i`th Fibonacci number as the sum of the previous two numbers. The `memo` array is used to store the results of the calculations, so that they can be reused in future calculations.

The `solve` function takes an integer `N` as input, calculates the `N`th Fibonacci number using the `fib` function, and prints the result.

The sample test case provided is:
```
5
```
The expected output is:
```
17
```
This is the correct output for the `5th` Fibonacci number, which is `17`.</s>
