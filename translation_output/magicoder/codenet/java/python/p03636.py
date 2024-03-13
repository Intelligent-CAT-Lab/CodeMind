<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    leng = len(s)
    print(s[0], end='')
    print(leng-2, end='')
    print(s[leng-1])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, calculates its length, and then prints the first character, the length minus 2, and the last character of the string. The `end=''` argument in the `print` function is used to prevent a newline from being printed after each character.<｜end▁of▁sentence｜>
