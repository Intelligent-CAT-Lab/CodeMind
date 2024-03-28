<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3882

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
        self.n, self.m = map(int, input().split())

    def run(self):
        base = self.n * 100 + self.m * 1800
        print(base << self.m)


if __name__ == "__main__":
    m = p03551()
    m.run()
```

In this Python code, we define a class `p03551` with a constructor that reads two integers from the input. The `run` method calculates the base value and then prints the result of left-shifting the base value by `m`.

The `if __name__ == "__main__":` block is used to ensure that the `run` method is only executed when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>
