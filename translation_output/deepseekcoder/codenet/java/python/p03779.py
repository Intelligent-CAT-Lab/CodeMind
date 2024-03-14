<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```

### Response:
```python
import sys

def p03779():
    x = int(sys.stdin.readline())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break
    print(ans)

p03779()
```

This Python code does the same thing as the Java code. It reads an integer from standard input, then finds the largest integer `i` such that `i * (i + 1) / 2` is less than or equal to the input integer. The result is printed to standard output.
<|EOT|>
