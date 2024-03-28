<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def run():
    n, c = map(int, input().split())
    num = [0] * n
    if c < 0:
        if n == 1:
            print(11)
        else:
            print('9' * (n * 2))
    else:
        a = 10 ** n
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if check(i, c):
                return

def check(i, c):
    builder = str(i) + str(c) + str(i)[::-1]
    if prime(int(builder)):
        print(builder)
        return True
    else:
        return False

def prime(b):
    for i in range(2, int(b ** 0.5) + 1):
        if b % i == 0:
            return False
    return True

run()
```

This Python code does the same thing as the Java code. It reads two integers from the input, checks if the second integer is less than zero, and if so, it prints either 11 or a string of 9s. If the second integer is not less than zero, it checks all numbers from the largest to the smallest possible number of length n, and if it finds a number that is a palindrome and a prime number, it prints it and returns. The `check` function checks if a number is a palindrome and a prime number, and the `prime` function checks if a number is prime.<｜end▁of▁sentence｜>
