<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    c = 0
    a = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    b = int(sys.stdin.readline().strip())
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers and a string from the standard input, then performs the operation specified by the string on the two integers and prints the result.
<|EOT|>
