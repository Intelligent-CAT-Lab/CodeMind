<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
AABB
ABAB
ABBA
BAAB
BABA
BBAA


```

import java.io.IOException;
import java.util.Scanner;

public class p00280 {

	public static void main(String[] args) throws IOException {

		new p00280().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		slove(0, 0, "");
	}

	private void slove(int x, int y, String s) {
		if ((x == 5 && y < b && y != 4) || y == 5 && x < a && x != 4)
			return;
		if (x == a + 1 || y == b + 1)
			return;
		if (x == a && y == b)
			System.out.println(s);
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				slove(x + 1, y, s + "A");
			} else
				slove(x, y + 1, s + "B");
		}
	}

	int a, b;
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    solve(0, 0, "")

def solve(x, y, s):
    if (x == 5 and y < b and y != 4) or (y == 5 and x < a and x != 4):
        return
    if x == a + 1 or y == b + 1:
        return
    if x == a and y == b:
        print(s)
    for i in range(2):
        if i == 0:
            solve(x + 1, y, s + "A")
        else:
            solve(x, y + 1, s + "B")

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from stdin, and the `map` function to convert the input string to a list of integers. The `solve` function is defined recursively, and it uses the `print` function to print the solution.</s>
