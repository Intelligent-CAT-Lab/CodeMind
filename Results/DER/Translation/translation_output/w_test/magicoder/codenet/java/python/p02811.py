<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Yes


```
import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}
```

@@ Response
```python
# Python code

# Get input from user
K, X = map(int, input().split())

# Check if X is less than or equal to 500*K
if X <= 500*K:
    print("Yes")
else:
    print("No")
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the second integer is less than or equal to 500 times the first integer, and prints "Yes" if it is, and "No" if it isn't.<｜end▁of▁sentence｜>
