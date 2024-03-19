<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 5 1

Expected output:
YE

```
import java.util.Scanner;

public class p03730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```
[/INST]
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:
    print("NO")
```

Explanation:

* `map(int, sys.stdin.readline().split())` is used to read the input from the standard input and convert it to a list of integers.
* `for i in range(5000)` is used to iterate over the range of numbers from 0 to 4999.
* `if a * i % b == c:` is used to check if the product of `a` and `i` modulo `b` is equal to `c`.
* `print("YES")` is used to print "YES" if the condition is true.
* `break` is used to exit the loop if the condition is true.
* `else: print("NO")` is used to print "NO" if the condition is false.</s>
