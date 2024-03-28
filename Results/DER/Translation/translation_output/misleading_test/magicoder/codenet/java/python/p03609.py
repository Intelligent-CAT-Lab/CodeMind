<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 17

Expected output:
21

```
import java.util.Scanner;

public class p03609 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}
```

@@ Response
```python
# Python code

# Get input from user
x, t = map(int, input().split())

# Check if x is greater than t
if x > t:
    print(x - t)
else:
    print("0")
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the first one is greater than the second one, and if so, it prints the difference between the two. If the first number is not greater than the second one, it prints "0".<｜end▁of▁sentence｜>
