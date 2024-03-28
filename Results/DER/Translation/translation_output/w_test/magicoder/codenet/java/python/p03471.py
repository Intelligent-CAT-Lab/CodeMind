<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
# Python code

X, Y = map(int, input().split())

judge = False
a, b, c = 0, 0, 0

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
        break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```

This Python code does the same thing as the Java code. It reads two integers X and Y from the input, and then tries to find three integers a, b, and c such that 10000*a + 5000*b + 1000*c = Y and a + b + c = X. If such integers exist, it prints them; otherwise, it prints "-1 -1 -1".<｜end▁of▁sentence｜>
