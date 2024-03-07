<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

s = int(sys.stdin.readline())
a = 1000000000
print("0 0", a, "1", (a - s % a) % a, " ", (s - 1) // a + 1)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `int(sys.stdin.readline())` converts the string to an integer.
* `a = 1000000000` is the value of the variable `a`.
* `print("0 0", a, "1", (a - s % a) % a, " ", (s - 1) // a + 1)` prints the output in the format specified in the problem.

Note: The `//` operator is used for integer division, which returns the integer part of the result. The `%` operator is used for modulo division, which returns the remainder of the result.</s>
