<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    s = int(sys.stdin.readline())
    a = 1000000000
    print("0 0 " + str(a) + " 1 " + str((a - s % a) % a) + " " + str((s - 1) // a + 1))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a long integer from standard input, calculates some values based on it, and then prints those values. The `//` operator in Python is used for integer division, which is equivalent to the `/` operator in Java. The `%` operator is used for modulo operation, which is equivalent to the `%` operator in Java. The `str()` function is used to convert integers to strings, which is equivalent to the `System.out.println()` in Java. The `sys.stdin.readline()` function is used to read a line from standard input, which is equivalent to the `new Scanner(System.in).next()` in Java.<｜end▁of▁sentence｜>
