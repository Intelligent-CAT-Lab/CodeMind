<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A == B ) {
			System.out.println(C);
		} else if(B == C) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}


	}
}
```

@@ Response
```python
# Python code

# Python does not have a direct equivalent to Java's Scanner class,
# so we use the built-in function input() to read user input.
# The function int() is used to convert the input to an integer.

A = int(input())
B = int(input())
C = int(input())

if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)
```

This Python code does the same thing as the Java code. It reads three integers from the user, and then prints the value of the third integer if the first two are equal, the first integer if the second and third are equal, and the second integer otherwise.<｜end▁of▁sentence｜>
