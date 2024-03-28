<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
46

```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```

### Response:
```python
def p01048():
    ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]
    i = int(input())

    print(ans[i])

p01048()
```

This Python function reads an integer from the standard input, and prints the corresponding element from the `ans` list.
<|EOT|>
