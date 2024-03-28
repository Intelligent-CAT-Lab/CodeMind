<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
9


```
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2 != 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p02952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (String.valueOf(i).length() % 2 != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```

In Python, we can use the `len()` function to get the length of a string, and the `%` operator to check if the length is odd or even. We can also use the `range()` function to iterate over a range of numbers.

Here's the Python code:
```
import sys

a = int(sys.stdin.readline())
c = 0
for i in range(1, a+1):
    if len(str(i)) % 2 != 0:
        c += 1
print(c)
```
Note that we use `sys.stdin.readline()` to read a line of input from the user, and `int()` to convert the input to an integer. We also use `str()` to convert the integer to a string, and `len()` to get the length of the string.</s>
