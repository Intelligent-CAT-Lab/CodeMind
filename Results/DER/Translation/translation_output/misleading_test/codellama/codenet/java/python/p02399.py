<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1

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

* `map(int, sys.stdin.readline().split())` reads a line from standard input and splits it into a list of integers using the `split()` method. The `map()` function is then used to convert each element of the list to an integer using the `int()` function.
* `a // b` is the integer division of `a` by `b`, which is equivalent to `a / b` but returns only the integer part of the result.
* `a % b` is the remainder of `a` divided by `b`.
* `"{:.5f}".format(a / b)` formats the result of `a / b` as a floating-point number with 5 decimal places.
* `print(d, r, f)` prints the results of the calculations.</s>
