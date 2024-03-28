<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Positive

```
import java.util.Scanner;

public class p04033 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}

```

### Response:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a <= 0 and 0 <= b:
        print("Zero")
    else:
        print("Positive" if (min(0, b) - min(-1, a)) % 2 == 1 else "Negative")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the first number is less than or equal to zero and the second number is greater than or equal to zero, and prints "Zero" if this is the case. Otherwise, it calculates the difference between the minimum of 0 and the second number and the minimum of -1 and the first number, and prints "Positive" if this difference is odd, and "Negative" otherwise.
<|EOT|>
