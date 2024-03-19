<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
-74

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
# Python code

# Read input
A, B, C = map(int, input().split())

# Find the maximum number
M = max(A, B, C)

# Check if the sum of A, B, C is even or odd
if (A + B + C) % 2 == M % 2:
    print((3 * M - (A + B + C)) // 2)
else:
    print(((3 * M + 3) - (A + B + C)) // 2)
```

This Python code does the same thing as the Java code. It reads three integers from the input, finds the maximum of them, and then checks if the sum of the three integers is even or odd. Depending on the result, it calculates and prints the result.<｜end▁of▁sentence｜>
