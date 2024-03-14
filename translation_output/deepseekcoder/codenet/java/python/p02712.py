<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
S = int(input())
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        continue
    else:
        ans = ans + i
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then calculates the sum of all integers from 1 to S (inclusive) that are not divisible by 3 or 5. The result is then printed to the standard output.
<|EOT|>
