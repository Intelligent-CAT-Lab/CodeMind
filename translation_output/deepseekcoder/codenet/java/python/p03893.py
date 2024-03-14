<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```

### Response:
```python
import sys

def main():
    x = int(sys.stdin.readline())
    next = 2
    for _ in range(x):
        next = (next + 1) * 2
    print(next)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from standard input, then calculates the next value based on the number of iterations specified by the input, and prints the result.
<|EOT|>
