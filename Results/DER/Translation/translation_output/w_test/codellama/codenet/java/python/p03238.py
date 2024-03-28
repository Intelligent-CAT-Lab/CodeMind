<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
Hello World


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
import sys

n = int(input())
if n == 1:
    print("Hello World")
else:
    a, b = map(int, input().split())
    print(a + b)
```
Explanation:

* The `import sys` statement is used to import the `sys` module, which provides access to the standard input and output streams.
* The `n = int(input())` statement reads an integer from the standard input and assigns it to the variable `n`.
* The `if n == 1:` statement checks if the value of `n` is equal to 1. If it is, the `print("Hello World")` statement is executed, which prints the string "Hello World" to the standard output.
* If the value of `n` is not equal to 1, the `else:` statement is executed. The `a, b = map(int, input().split())` statement reads two integers from the standard input and assigns them to the variables `a` and `b`. The `print(a + b)` statement prints the sum of `a` and `b` to the standard output.
* The `fs.close()` statement is not needed in Python, as the `input()` function automatically closes the standard input stream when it is finished reading.</s>
