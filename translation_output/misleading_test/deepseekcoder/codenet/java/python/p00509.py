<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 0

Expected output:
127

```

import java.io.IOException;
import java.util.Scanner;

public class p00509 {

	public static void main(String[] args) throws IOException {

		new p00509().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int[] num = new int[n];
		if (c < 0) {
			if (n == 1)
				System.out.println(11);
			else {
				for (int i = 0; i < n * 2; i++)
					System.out.print(9);
				System.out.println();
			}
		} else {
			int a = 1;
			for (int i = 0; i < n; i++)
				a *= 10;
			int b = a / 10;
			a--;
			for (int i = a; i >= b; i--) {
				if (check(i, c))
					return;

			}
		}
	}

	private boolean check(int i, int c) {
		StringBuilder builder = new StringBuilder(String.valueOf(i));
		StringBuilder builder2 = new StringBuilder(String.valueOf(i)).reverse();
		builder.append(c).append(builder2);
		if (prime(Integer.valueOf(builder.toString()))) {
			System.out.println(builder);
			return true;
		} else
			return false;

	}

	private boolean prime(int b) {
		for (int i = 2; i * i <= b; i++)
			if (b % i == 0)
				return false;
		return true;
	}
}
```

### Response:
```python
import sys

def run():
    n, c = map(int, sys.stdin.readline().split())
    num = [0]*n
    if c < 0:
        if n == 1:
            print(11)
        else:
            print('9'* (n * 2))
    else:
        a = 10 ** n
        b = a // 10
        a -= 1
        for i in range(a, b-1, -1):
            if check(i, c):
                return

def check(i, c):
    s = str(i)
    s2 = s[::-1]
    num = int(s + str(c) + s2)
    if prime(num):
        print(num)
        return True
    return False

def prime(n):
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

run()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the second integer is negative, and if so, it prints a string of 9's. If the second integer is not negative, it checks all numbers from 10 to the nth power minus 1, in reverse order, to see if they are prime and have the same digits as the original number plus the second integer in reverse order. If it finds such a number, it prints it and stops.
<|EOT|>
