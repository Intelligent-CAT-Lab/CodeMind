<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
23

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
# Python code

a = int(input())
print(a + (a*a) + (a*a*a))
```

In this Python code, we are taking an integer input from the user and then printing the result of the expression `a + (a*a) + (a*a*a)`. The `input()` function in Python is used to take user input, and `int()` is used to convert the input string into an integer. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
