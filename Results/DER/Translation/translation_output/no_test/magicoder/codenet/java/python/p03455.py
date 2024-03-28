<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```

@@ Response
```python
import sys

def main():
    X = int(sys.stdin.readline())
    Y = int(sys.stdin.readline())
    if X % 2 == 0 or Y % 2 == 0:
        print("Even")
        return
    print("Odd")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two long integers from the standard input, checks if either of them is even, and prints "Even" if it is, otherwise it prints "Odd".<｜end▁of▁sentence｜>
