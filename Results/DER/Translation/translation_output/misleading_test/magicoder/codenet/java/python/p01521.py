<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o

```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x' ? "x":"o");
	}
}
```

@@ Response
```python
def main():
    c = input()
    print("x" if c[0] == 'x' and c[-1] == 'x' else "o")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to get the input string. We then check if the first and last characters of the string are 'x'. If they are, we print 'x'. Otherwise, we print 'o'.<｜end▁of▁sentence｜>
