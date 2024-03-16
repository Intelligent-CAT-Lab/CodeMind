<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

X, Y = map(int, input().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X + 1):
    for k in range(X - i + 1):
        sum = 10000 * i + 5000 * k + 1000 * (X - i - k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X - i - k
            break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```
This is the Python code that translates the Java code you provided. The main difference is that Python uses the `input()` function to read input from the user, and the `print()` function to print output. The rest of the code is similar, with the exception of the `break` statement, which is used to exit the inner loop in Python.</s>
