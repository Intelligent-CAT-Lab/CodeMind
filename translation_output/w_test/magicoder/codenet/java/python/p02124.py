<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}

```

@@ Response
```python
import sys

def p02124():
    ans = "ai1333"
    x = int(sys.stdin.readline())
    for i in range(x//100):
        ans += "3"
    print(ans)

p02124()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `//` operator is used for integer division in Python. The `range()` function is used to iterate a specified number of times. The `+=` operator is used to append the string "3" to the `ans` variable. Finally, the `print()` function is used to output the result.<｜end▁of▁sentence｜>
