<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

class p03551:

    def __init__(self):
        pass

    def run(self):

        n = int(sys.stdin.readline())
        m = int(sys.stdin.readline())

        base = n*100+m*1800

        print(base << m)


if __name__ == "__main__":
    m = p03551()
    m.run()
```

In Python, the equivalent of the Java `Scanner` class is `sys.stdin.readline()`. The `run()` method is defined as a method of the `p03551` class, and the `main()` method is replaced by the `if __name__ == "__main__":` guard. The `run()` method reads two integers from the standard input, calculates a base value, and then prints the result of a bitwise left shift operation on the base value.
<|EOT|>
