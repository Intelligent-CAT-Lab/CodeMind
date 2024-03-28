<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
-50

```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
print((a * a < b * b) * b or a)
```
This code uses the `map` function to convert the input strings to integers, and then uses the `*` operator to calculate the squares of `a` and `b`. The `print` function is then used to print the larger of the two squares.

Note that the `or` operator is used instead of the `?:` operator in the Java code, as Python does not have a ternary operator.</s>
