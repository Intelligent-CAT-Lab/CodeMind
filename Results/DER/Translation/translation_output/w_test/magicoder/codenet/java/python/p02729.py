<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```

@@ Response
```python
# Python code

# Read input from user
n, m = map(int, input().split())

# Calculate combinations
nComb = n * (n-1) // 2
mComb = m * (m-1) // 2

# Print the result
print(nComb + mComb)
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the combinations for each integer, and then prints the sum of the two combinations. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
