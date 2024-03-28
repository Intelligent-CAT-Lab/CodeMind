<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import sys

a = int(input())
print(a + (a**2) + (a**3))
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the system's input and output streams.
* `a = int(input())` is used to read an integer from the user and store it in the variable `a`.
* `print(a + (a**2) + (a**3))` is used to print the sum of `a`, `a**2`, and `a**3`. The `**` operator is used to perform exponentiation.

Note: The `input()` function is used to read a string from the user, and the `int()` function is used to convert the string to an integer.</s>
