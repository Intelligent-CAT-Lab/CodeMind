<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000

Expected output:
6BC

```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```

@@ Response
Here is the equivalent Python code:

```python
def main():
    num = int(input())
    print("ABC" if num < 1200 else "ARC")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints "ABC" if the number is less than 1200, otherwise it prints "ARC".<｜end▁of▁sentence｜>
