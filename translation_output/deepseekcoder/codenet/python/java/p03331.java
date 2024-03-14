<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

import sys
def input():
	return sys.stdin.readline().strip()

N = int(input())

def sum_N(N):
	total = 0
	x = N
	while x > 0:
		total += x % 10
		x = x // 10
	return total

ans = 1000000000000
for i in range(1, N):
	ans = min(ans, sum_N(i) + sum_N(N - i))

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 1000000000000L;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }
        System.out.println(ans);
    }

    public static long sum_N(int N) {
        long total = 0;
        while (N > 0) {
            total += N % 10;
            N = N / 10;
        }
        return total;
    }
}
```

In the Java code, we use `Scanner` to read the input from the standard input. The `sum_N` function is the same as in the Python code. The `main` function is the entry point of the program. It reads the input `N`, calculates the minimum sum of digits for all possible values of `i` and `N - i`, and prints the result. The `long` type is used for the variable `ans` to avoid overflow.
<|EOT|>
