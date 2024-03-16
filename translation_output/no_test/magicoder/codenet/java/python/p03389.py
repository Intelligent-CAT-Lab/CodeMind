<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03389 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int M = Math.max(A, Math.max(B, C));

		if((A+B+C)%2 == M%2) {
			System.out.println((3*M-(A+B+C))/2);
		}else {
			System.out.println(((3*M+3)-(A+B+C))/2);
		}

	}

}

```

@@ Response
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    M = max(A, max(B, C))

    if (A+B+C)%2 == M%2:
        print((3*M-(A+B+C))//2)
    else:
        print(((3*M+3)-(A+B+C))//2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, finds the maximum of them, and then checks if the sum of the three integers is evenly divisible by the maximum. If it is, it prints the result of the calculation; otherwise, it prints the result of a different calculation.<｜end▁of▁sentence｜>
