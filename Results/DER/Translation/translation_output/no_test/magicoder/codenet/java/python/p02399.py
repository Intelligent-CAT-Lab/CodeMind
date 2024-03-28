<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    d = a // b
    r = a % b
    f = "%.5f" % (a / b)

    print(d, r, f)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the quotient and remainder of the division, and the floating point division, and then prints them.<｜end▁of▁sentence｜>
