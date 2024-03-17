<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 0

Expected output:
101


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

python code:<fim_suffix><fim_middle>

```python
import sys

def check(i, c):
	builder = str(i) + str(c) + str(i)[::-1]
	if prime(int(builder)):
		print builder
		return True
	else:
		return False

def prime(b):
	for i in range(2, b):
		if b % i == 0:
			return False
	return True

def main():
	n = int(sys.stdin.readline())
	c = int(sys.stdin.readline())
	if c < 0:
		if n == 1:
			print 11
		else:
			for i in range(n * 2):
				print 9
			print
	else:
		a = 1
		for i in range(n):
			a *= 10
		b = a / 10
		a -= 1
		for i in range(a, b - 1, -1):
			if check(i, c):
				return

if __name__ == '__main__':
	main()
```
<|endoftext|>
