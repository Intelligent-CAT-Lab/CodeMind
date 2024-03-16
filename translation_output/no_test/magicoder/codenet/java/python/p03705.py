<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

	public class p03705 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			
			if(a>b||(n==1&&a!=b)) {
				System.out.println(0);
				return;
			}
			if(a==b) {
				System.out.println(1);
				return;
			}
			
			System.out.println((n-2)*(b-a)+1);
			
	    }
				
	}

```

@@ Response
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())

    if a > b or (n == 1 and a != b):
        print(0)
        return
    if a == b:
        print(1)
        return

    print((n - 2) * (b - a) + 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, checks some conditions, and then prints the result. The `sys.stdin.readline().split()` line is used to read the input, and `map(int, ...)` is used to convert the input strings to integers.<｜end▁of▁sentence｜>
