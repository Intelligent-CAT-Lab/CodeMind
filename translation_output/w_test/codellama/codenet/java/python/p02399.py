<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

d = a // b
r = a % b
f = "{:.5f}".format(a / b)

print(d, r, f)
```
Explanation:

* `map(int, sys.stdin.readline().split())` reads a line from standard input and splits it into a list of integers using the `split()` method. The `map()` function applies the `int()` function to each element of the list, which converts each element to an integer.
* `a // b` is the integer division of `a` by `b`, which returns the integer part of the result.
* `a % b` is the modulo operation of `a` by `b`, which returns the remainder of the division.
* `"{:.5f}".format(a / b)` formats the result of `a / b` as a floating-point number with 5 decimal places.
* `print(d, r, f)` prints the results of the calculations.</s>
