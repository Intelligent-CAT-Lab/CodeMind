<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


```
import java.util.Scanner;

public class p03551 {

	public static void main(String[] args) {
		p03551 m = new p03551();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}

```

@@ Response
```python
class p03551:

    def __init__(self):
        self.n = 0
        self.m = 0

    def run(self):
        self.n, self.m = map(int, input().split())
        base = self.n * 100 + self.m * 1800
        print(base << self.m)


if __name__ == "__main__":
    m = p03551()
    m.run()
```

In Python, the equivalent code would be:

```python
class p03551:

    def __init__(self):
        self.n = 0
        self.m = 0

    def run(self):
        self.n, self.m = map(int, input().split())
        base = self.n * 100 + self.m * 1800
        print(base << self.m)


if __name__ == "__main__":
    m = p03551()
    m.run()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates a base value, and then prints the result of shifting the base value to the left by the number of moves specified by the second integer.<｜end▁of▁sentence｜>
