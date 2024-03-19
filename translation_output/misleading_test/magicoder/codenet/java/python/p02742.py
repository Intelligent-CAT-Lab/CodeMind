<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
95

```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```

@@ Response
```python
import sys

def main():
    w, h = map(int, sys.stdin.readline().split())

    if w == 1 or h == 1:
        print(1)
        return

    c = (w*h)//2 if (w*h)%2 == 0 else (w*h)//2 + 1
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if either of them is 1, and if not, calculates the result as described in the Java code. The result is then printed to the standard output.<｜end▁of▁sentence｜>
