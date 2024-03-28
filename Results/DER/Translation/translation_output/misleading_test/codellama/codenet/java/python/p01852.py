<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
-51

```
import java.util.Scanner;

/**
 * A : ???????????Â°?????? / Finger Counting
 */
public class p01852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		long n = sc.nextLong();
		int count = 0;

		if (n > 0) {
			while (n >= 2) {
				n /= 2;
				count++;
			}
			count++;
		}
		System.out.println(count);
	}
}
```
[/INST]
```
import sys

n = int(sys.stdin.readline())
count = 0

if n > 0:
    while n >= 2:
        n //= 2
        count += 1
    count += 1

print(count)
```
This code reads a single integer `n` from standard input using the `sys.stdin.readline()` method, and then calculates the number of fingers needed to count up to `n` using a while loop. The `//=` operator is used to perform integer division and assignment in a single step. Finally, the result is printed to the console using the `print()` function.</s>
