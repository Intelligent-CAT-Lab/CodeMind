<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    s = sys.stdin.readline().strip()
    b = int(sys.stdin.readline())
    c = 0
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three inputs from the standard input: two integers and a string. It then performs the operation specified by the string on the two integers and prints the result.<｜end▁of▁sentence｜>
