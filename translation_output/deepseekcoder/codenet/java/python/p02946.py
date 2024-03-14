<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```

### Response:
```python
import sys

def main():
    K = int(sys.stdin.readline().strip())
    X = int(sys.stdin.readline().strip())

    for i in range(X - K + 1, X + K):
        if i != X + K - 1:
            print(i, end=" ")
        else:
            print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, then prints a range of integers centered around the second integer, with a width of the first integer. The range does not include the endpoints, and the integers are printed on the same line, separated by spaces.
<|EOT|>
