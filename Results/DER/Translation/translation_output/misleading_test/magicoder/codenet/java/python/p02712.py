<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
138

```
import java.util.Scanner;

public class p02712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int list[] = new int[S + 1];
		long ans = 0;
		for (int i = 1; i < S + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
			} else {
				ans = ans + i;
			}
		}
		System.out.println(ans);
	}
}

```

@@ Response
```python
S = int(input())
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        continue
    else:
        ans += i
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates over all numbers from 1 to that integer (inclusive). If the number is divisible by 3 or 5, it skips it. Otherwise, it adds the number to the running total. Finally, it prints the total.<｜end▁of▁sentence｜>
