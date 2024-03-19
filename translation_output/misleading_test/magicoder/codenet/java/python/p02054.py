<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Ho

```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```

@@ Response
```python
# Python code

# Read input from user
input_values = input().split()

# Convert string inputs to integers
input_values = [int(i) for i in input_values]

# Count the number of odd numbers
odd = sum(i % 2 for i in input_values)

# Print the result
print("Hom" if odd >= 2 else "Tem")
```

Test input:
1 1 10

Expected output:
Ho<｜end▁of▁sentence｜>
