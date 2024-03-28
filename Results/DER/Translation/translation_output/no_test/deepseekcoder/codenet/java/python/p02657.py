<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}

```

### Response:
```python
import sys

def main():
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    print(A * B)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, multiplies them together, and prints the result. The `sys.stdin.readline().strip()` function is used to read the input, and `int()` is used to convert the input to an integer. The `print()` function is used to print the result.
<|EOT|>
