<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println(1);
			break;
		case 1:
			System.out.println(2);
			break;
		case 2:
			System.out.println(1);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}

}
```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    if n == 0:
        print(1)
    elif n == 1:
        print(2)
    elif n == 2:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then uses a series of if-elif-else statements to print the corresponding output based on the value of n.<｜end▁of▁sentence｜>
