<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 8 1000 999

Expected output:
Alice


```
import java.util.*;

public class p02162 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		if (r1 == -1 || r2 == -1) {
		    r1 = -t1;
		    r2 = -t2;
		}
		if (r1 == r2) {
		    System.out.println("Draw");
		} else if (r1 < r2) {
		    System.out.println("Bob");
		} else {
		    System.out.println("Alice");
		}
	}
}


```

@@ Response
```python
# Python code

# Read input
t1, t2, r1, r2 = map(int, input().split())

# If r1 or r2 is -1, set them to -t1 and -t2 respectively
if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2

# Compare r1 and r2 and print the result
if r1 == r2:
    print("Draw")
elif r1 < r2:
    print("Bob")
else:
    print("Alice")
```

This Python code does the same thing as the Java code. It reads four integers from the input, and if either r1 or r2 is -1, it sets them to -t1 and -t2 respectively. Then it compares r1 and r2 and prints the result.<｜end▁of▁sentence｜>
