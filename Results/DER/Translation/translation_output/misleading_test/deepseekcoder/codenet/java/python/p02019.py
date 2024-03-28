<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3 2 1

Expected output:
36

```
import java.util.*;

public class p02019 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    System.out.println(n - a - b + c);
	}
}


```

### Response:
```python
def p02019():
    n, a, b, c = map(int, input().split())
    print(n - a - b + c)

p02019()
```

In this Python code, we use the built-in `input()` function to read the input from the user. The `split()` function is used to split the input into multiple parts. The `map()` function is used to convert each part into an integer. The result is stored in the variables `n`, `a`, `b`, and `c`. Finally, the result is printed out by subtracting `a` and `b` from `n` and adding `c`.
<|EOT|>
