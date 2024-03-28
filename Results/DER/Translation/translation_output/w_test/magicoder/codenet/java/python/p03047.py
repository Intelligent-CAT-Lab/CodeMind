<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2


```
import java.util.*;
public class p03047 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// æ´æ°ã®å¥å
		int n = sc.nextInt();
		int k= sc.nextInt();
		
		System.out.println(n-k+1);

	}
}
```

@@ Response
```python
# Python code

# Get input from user
n, k = map(int, input().split())

# Print the result
print(n-k+1)
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the result as `n-k+1`, and then prints the result.<｜end▁of▁sentence｜>
