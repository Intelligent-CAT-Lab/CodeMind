<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
win


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

# Read input from user
a, b, c = map(int, input().split())

# Check if the sum of the three numbers is greater than or equal to 22
if a + b + c >= 22:
    print("bust")
else:
    print("win")
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates their sum, and then prints "bust" if the sum is 22 or more, and "win" otherwise.<｜end▁of▁sentence｜>
