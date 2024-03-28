<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
47

```
import java.util.*;
public class p03844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		if(s.equals("+")) {
			c = a + b;
		}else if(s.equals("-")) {
			c = a - b;
		}
		System.out.print(c);
	}
}
```

### Response:
```python
def p03844():
    import sys
    import io
    input_text = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    a = int(input_text.readline().strip())
    s = input_text.readline().strip()
    b = int(input_text.readline().strip())
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

p03844()
```

This Python code reads from the standard input (stdin) and performs the operation specified by the string `s`. If `s` is "+", it adds `a` and `b`. If `s` is "-", it subtracts `b` from `a`. The result is then printed to the standard output (stdout).
<|EOT|>
