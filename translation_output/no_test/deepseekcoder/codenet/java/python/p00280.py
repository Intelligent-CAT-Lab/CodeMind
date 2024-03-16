<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
class p00280:

    def __init__(self):
        self.a = 0
        self.b = 0

    def run(self):
        self.a = int(input())
        self.b = int(input())
        self.slove(0, 0, "")

    def slove(self, x, y, s):
        if ((x == 5 and y < self.b and y != 4) or (y == 5 and x < self.a and x != 4)):
            return
        if (x == self.a + 1 or y == self.b + 1):
            return
        if (x == self.a and y == self.b):
            print(s)
        for i in range(2):
            if i == 0:
                self.slove(x + 1, y, s + "A")
            else:
                self.slove(x, y + 1, s + "B")

if __name__ == "__main__":
    p00280().run()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then uses those integers to generate all possible strings of "A"s and "B"s of length `a` and `b`. It prints out all such strings.
<|EOT|>
