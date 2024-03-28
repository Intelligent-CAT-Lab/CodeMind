<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}

```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    c = int(sys.stdin.readline().strip())
    if a + b + c >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, adds them together, and checks if the sum is greater than or equal to 22. If it is, it prints "bust"; otherwise, it prints "win".
<|EOT|>
