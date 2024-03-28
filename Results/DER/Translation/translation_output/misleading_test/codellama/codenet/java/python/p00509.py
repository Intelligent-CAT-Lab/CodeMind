<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    n, c = map(int, sys.stdin.readline().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            for i in range(n * 2):
                print(9, end='')
            print()
    else:
        a = 1
        for i in range(n):
            a *= 10
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if check(i, c):
                return

def check(i, c):
    builder = str(i)
    builder2 = builder[::-1]
    builder += str(c) + builder2
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

if __name__ == '__main__':
    main()
```
Note that the Python code uses the `sys` module to read input from stdin, and the `range` function to iterate over the numbers in the range. The `map` function is used to convert the input strings to integers. The `str` function is used to convert the integer to a string, and the `[::-1]` notation is used to reverse the string. The `print` function is used to print the output.</s>
