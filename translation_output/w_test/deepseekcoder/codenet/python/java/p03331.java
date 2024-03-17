<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
6


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
        scanner.close();

        long ans = 1000000000000L;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumN(i) + sumN(N - i));
        }

        System.out.println(ans);
    }

    private static long sumN(int n) {
        long total = 0;
        while (n > 0) {
            total += n % 10;
            n = n / 10;
        }
        return total;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of digits for each number from 1 to N-1, and then finds the minimum sum of these sums. The result is printed to the standard output.
<|EOT|>
