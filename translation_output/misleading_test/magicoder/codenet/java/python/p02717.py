<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
93 98 77

```
import java.util.Scanner;
public class p02717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+a+" "+b);
	}

}

```

@@ Response
```python
# Python code

# Read input from user
a, b, c = map(int, input().split())

# Print the output
print(c, a, b)
```

Test input:
1 2 3

Expected output:
93 98 77<｜end▁of▁sentence｜>
