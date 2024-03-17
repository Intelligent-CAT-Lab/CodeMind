<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
3.000000 0


```
import java.util.*;
import java.io.*;

public class p03001
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int w=in.nextInt();
		int h=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		double ans=(double)w*(double)h/2;
		int a=0;
		if(x+x==w&&y+y==h)
			a=1;
		System.out.println(ans+" "+a);
	}
}
	
```

### Response:
```python
import sys

def main():
    w, h, x, y = map(int, sys.stdin.readline().split())
    ans = (w * h) / 2
    a = 0
    if x * 2 == w and y * 2 == h:
        a = 1
    print(f"{ans} {a}")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The `if` statement checks if the coordinates `x` and `y` satisfy the condition `x + x == w` and `y + y == h`. If they do, `a` is set to 1. The `print()` function is used to output the result. The `f"{ans} {a}"` syntax is used to format the output string.
<|EOT|>
