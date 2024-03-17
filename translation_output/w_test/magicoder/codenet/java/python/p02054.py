<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Hom


```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```

@@ Response
```python
# Python code

# Read input from user
numbers = list(map(int, input().split()))

# Count the number of odd numbers
odd = sum(num % 2 for num in numbers)

# Print the result
print("Hom" if odd >= 2 else "Tem")
```

This Python code does the same thing as the Java code. It reads three integers from the user, counts the number of odd numbers among them, and then prints "Hom" if there are two or more odd numbers, otherwise it prints "Tem".<｜end▁of▁sentence｜>
