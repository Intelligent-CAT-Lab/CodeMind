<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumN(i) + sumN(N - i));
        }

        System.out.println(ans);
    }

    private static int sumN(int N) {
        int total = 0;
        while (N > 0) {
            total += N % 10;
            N /= 10;
        }
        return total;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then calculates the minimum sum of the digits of two numbers (i and N-i) that add up to N. The result is then printed to the standard output.<｜end▁of▁sentence｜>
