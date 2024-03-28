<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
No


```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```

@@ Response
```python
# Python code

# Get input from user
h, w, x, y = map(int, input().split())

# Check if the product of h and w is odd and the sum of x and y is odd
if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")
```

This Python code does the same thing as the Java code. It reads four integers from the user, checks if the product of the first two is odd and the sum of the last two is odd, and then prints "No" if either condition is true, otherwise it prints "Yes".<｜end▁of▁sentence｜>
