<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
-4

```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

### Response:
```python
import sys

def p02552(n):
    if n==0:
        return 1
    else:
        return 0

n = int(sys.stdin.readline())
print(p02552(n))
```

In this Python code, we define a function `p02552` that takes an integer `n` as input. If `n` is 0, the function returns 1; otherwise, it returns 0. The input is read from the standard input using `sys.stdin.readline()`, and the result is printed to the standard output using `print()`.
<|EOT|>
