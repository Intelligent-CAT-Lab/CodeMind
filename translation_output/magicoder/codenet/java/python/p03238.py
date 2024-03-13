<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    if n == 1:
        print("Hello World")
    else:
        a, b = map(int, sys.stdin.readline().split())
        print(a + b)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's 1, and if so, it prints "Hello World". If the integer is not 1, it reads two more integers from the standard input, adds them together, and prints the result.<｜end▁of▁sentence｜>
