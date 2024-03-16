<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```

### Response:
```python
import sys

def main():
    T = int(sys.stdin.readline().strip())
    X = int(sys.stdin.readline().strip())
    a = T / X
    print(a)

if __name__ == "__main__":
    main()
```

In Python, we don't need to close the scanner as it's not used in this code. Also, we use `sys.stdin.readline().strip()` to read the input from the console. The `strip()` function is used to remove any leading/trailing white spaces. The `int()` function is used to convert the input to an integer. The `print()` function is used to print the result.
<|EOT|>
