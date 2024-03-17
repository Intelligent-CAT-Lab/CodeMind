<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def slove(x, y, s):
    if ((x == 5 and y < b and y != 4) or (y == 5 and x < a and x != 4)):
        return
    if (x == a + 1 or y == b + 1):
        return
    if (x == a and y == b):
        print(s)
    for i in range(2):
        if i == 0:
            slove(x + 1, y, s + "A")
        else:
            slove(x, y + 1, s + "B")

def main():
    global a, b
    a, b = map(int, input().split())
    slove(0, 0, "")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the input, and then calls the `slove` function to print all possible combinations of "A" and "B" of length `a` and `b`. The `slove` function is a recursive function that tries to add "A" or "B" to the string `s` and then calls itself with the new string and the new lengths of `s`. If the lengths of `s` are equal to `a` and `b`, it prints `s`.
<|EOT|>
