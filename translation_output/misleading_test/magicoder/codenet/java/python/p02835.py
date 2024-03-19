<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
vin

```
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}

```

@@ Response
```python
# Python code

# Get input from user
a, b, c = map(int, input().split())

# Check if the sum of the three numbers is greater than or equal to 22
if a + b + c >= 22:
    print("bust")
else:
    print("win")
```

This Python code does the same thing as the Java code. It reads three integers from the user, adds them together, and then checks if the sum is greater than or equal to 22. If it is, it prints "bust". If it's not, it prints "win".<｜end▁of▁sentence｜>
