<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 45000

Expected output:
4 0 5


```
import java.util.Scanner;

public class p03471 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int sum=0;
		boolean judge=false;
		int a=0;
		int b=0;
		int c=0;

		for (int i=0; i<X+1; i++) {
			for (int k=0; k<X-i+1; k++) {
				sum = 10000*i + 5000*k + 1000*(X-i-k);
				if (sum==Y) {
					judge = true;
					a=i;
					b=k;
					c=X-i-k;
					break;
				}
			}
		}
		if (judge) {
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print(" ");
			System.out.print(c);

		} else {
			System.out.println("-1 -1 -1");
		}

	}

}
```
[/INST]

Here is the Python code that solves the problem:
```python
import sys

X, Y = map(int, sys.stdin.readline().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X+1):
    for k in range(X-i+1):
        sum = 10000*i + 5000*k + 1000*(X-i-k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X-i-k
            break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```
This code uses the `map` function to convert the input from a string to a list of integers, and then uses a nested `for` loop to iterate over the possible values of `i` and `k` to find the solution. The `sum` variable is used to store the current sum, and the `judge` variable is used to keep track of whether a solution has been found. If a solution is found, the `a`, `b`, and `c` variables are set to the corresponding values, and the solution is printed. If no solution is found, the program prints `-1 -1 -1`.</s>
