<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 2 0 1


```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```
[/INST]
```
import java.util.*;

public class p02963 {
	public static void main(String[] args) {
		long s = Long.parseLong(new Scanner(System.in).next());
		int a = 1000000000;
		System.out.println("0 0 " + a + " 1 " + (a - s % a) % a + " " + ((s - 1) / a + 1));
	}
}
```

This is the Java code that you provided. To translate it to Python, we can use the `input()` function to read the input from the user, and the `print()` function to print the output. We can also use the `//` operator to perform integer division and the `%` operator to perform modulo division.

Here is the Python code that translates the Java code:
```
s = int(input())
a = 1000000000
print("0 0", a, "1", (a - s % a) % a, " ", ((s - 1) // a + 1))
```
This code reads the input from the user, calculates the values for `a` and `s`, and then prints the output in the same format as the Java code.

I hope this helps! Let me know if you have any questions.</s>
