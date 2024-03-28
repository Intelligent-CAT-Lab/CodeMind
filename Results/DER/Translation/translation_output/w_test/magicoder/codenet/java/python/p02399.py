<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```

@@ Response
```python
# Python code

# Read input
a, b = map(int, input().split())

# Calculate division and remainder
d = a // b
r = a % b

# Calculate division as float and format to 5 decimal places
f = "{:.5f}".format(a / b)

# Print the results
print(d, r, f)
```

Test input:
3 2

Expected output:
1 1 1.50000<｜end▁of▁sentence｜>
