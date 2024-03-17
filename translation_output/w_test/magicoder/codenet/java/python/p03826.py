<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
15


```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```

@@ Response
```python
# Python code

# Read input from user
a, b, c, d = map(int, input().split())

# Calculate the product of the first two numbers and the second two numbers
a = a * b
b = c * d

# Print the larger of the two products
print(max(a, b))
```

Test input:
3 5 2 7

Expected output:
15<｜end▁of▁sentence｜>
