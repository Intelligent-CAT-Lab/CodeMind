Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
		if ((x == 5 && y < b && y!= 4) || y == 5 && x < a && x!= 4)
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
import sys

class p00280:
    def __init__(self):
        self.a = 0
        self.b = 0

    def run(self):
        self.a = int(sys.stdin.readline().strip())
        self.b = int(sys.stdin.readline().strip())
        self.slove(0, 0, "")

    def slove(self, x, y, s):
        if (x == 5 and y < self.b and y!= 4) or y == 5 and x < self.a and x!= 4:
            return
        if x == self.a + 1 or y == self.b + 1:
            return
        if x == self.a and y == self.b:
            print(s)
        for i in range(2):
            if i == 0:
                self.slove(x + 1, y, s + "A")
            else:
                self.slove(x, y + 1, s + "B")

if __name__ == '__main__':
    p00280().run()
```<|endoftext|>
