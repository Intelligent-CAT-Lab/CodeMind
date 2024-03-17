<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

a = int(sys.stdin.readline())
print(a + (a*a) + (a*a*a))
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `a = int(sys.stdin.readline())` reads a line of input from the standard input stream and converts it to an integer using the `int()` function.
* `print(a + (a*a) + (a*a*a))` prints the sum of the input number, its square, and its cube.

Note: The `sys.stdin.readline()` method reads a line of input from the standard input stream and returns it as a string. The `int()` function converts the string to an integer.</s>
