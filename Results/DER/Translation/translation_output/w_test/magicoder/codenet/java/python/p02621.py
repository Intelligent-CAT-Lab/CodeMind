<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
import java.util.Scanner;
public class p02621
{
	public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a  = sc.nextInt();
      System.out.println(a + (a*a) + (a*a*a));
    }
      
}    

```

@@ Response
```python
a = int(input())
print(a + (a*a) + (a*a*a))
```

This Python code does the same thing as the Java code. It reads an integer from the user, squares it, cubes it, and then adds the original number, the square, and the cube together. The result is then printed to the console.<｜end▁of▁sentence｜>
