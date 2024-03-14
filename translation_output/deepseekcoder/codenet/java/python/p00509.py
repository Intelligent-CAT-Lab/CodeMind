<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class p00509:

    def __init__(self):
        self.run()

    def run(self):
        n = int(sys.stdin.readline().strip())
        c = int(sys.stdin.readline().strip())
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
                if self.check(i, c):
                    return

    def check(self, i, c):
        s = str(i)
        s_rev = s[::-1]
        s_new = s + str(c) + s_rev
        if self.prime(int(s_new)):
            print(s_new)
            return True
        else:
            return False

    def prime(self, b):
        for i in range(2, int(b**0.5)+1):
            if b % i == 0:
                return False
        return True

p00509()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then checks if the second integer is a digit to be appended to the reversed version of the first integer. If it is, it checks if the resulting number is a prime number. If it is, it prints the number; otherwise, it continues to the next number. If the second integer is negative, it prints all 9s if the first integer is 1, or the first integer number of 9s otherwise.
<|EOT|>
