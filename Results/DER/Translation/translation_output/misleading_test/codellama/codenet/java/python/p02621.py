<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

a = int(sys.stdin.readline())
print(a + (a*a) + (a*a*a))
```
Explanation:

* `sys.stdin.readline()` reads a line of input from the standard input stream.
* `int()` converts the input string to an integer.
* `print()` prints the result to the standard output stream.

Note: The `print()` function in Python 3 is different from the `print()` function in Python 2. In Python 3, `print()` is a function that returns `None`, whereas in Python 2, `print()` is a statement that prints to the standard output stream.</s>
