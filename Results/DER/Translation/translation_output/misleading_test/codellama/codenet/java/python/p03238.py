<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
Hell WoMrld

```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p03238 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
        } else {
            int a = fs.nextInt();
            int b = fs.nextInt();
            System.out.println(a + b);
        }
        fs.close();
    }
}
```

Here's the Python code:
```
import sys

n = int(input())
if n == 1:
    print("Hello World")
else:
    a = int(input())
    b = int(input())
    print(a + b)
```
Note that the `input()` function in Python is used to read a line of input from the user, and it returns a string. In the Java code, the `nextInt()` method of the `Scanner` class is used to read an integer from the input stream. In Python, we can use the `int()` function to convert a string to an integer.</s>
