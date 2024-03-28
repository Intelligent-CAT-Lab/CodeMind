<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
95

```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```
[/INST]
```python
import sys

w, h = map(int, sys.stdin.readline().split())

if w == 1 or h == 1:
    print(1)
else:
    print((w * h) // 2 + 1 if (w * h) % 2 == 1 else (w * h) // 2)
```
Explanation:

* `map(int, sys.stdin.readline().split())` is used to read the input from the standard input and split it into two integers `w` and `h`.
* `if w == 1 or h == 1:` is used to check if either `w` or `h` is equal to 1, and if so, print 1 and return.
* `else:` is used to execute the code inside the else block if the condition in the if statement is not met.
* `(w * h) // 2 + 1 if (w * h) % 2 == 1 else (w * h) // 2` is used to calculate the number of cells in the grid. If the number of cells is odd, we add 1 to the result of the division by 2. If the number of cells is even, we divide by 2.
* `print((w * h) // 2 + 1 if (w * h) % 2 == 1 else (w * h) // 2)` is used to print the result of the calculation.</s>
