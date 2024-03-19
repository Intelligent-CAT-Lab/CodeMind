<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
12: -44 -21 18

```
import java.util.Scanner;

//?Â´??????Â°????Â§Â£?????????????????Â°??????
public class p02467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		System.out.print(n + ":");
		for (int i = 2; n >= i * i;) {
			if (n % i == 0) {
				n = n / i;
				System.out.print(" " + i);
			} else {
				i++;
			}
		}
		System.out.println(" " + n);
	}

}
```

@@ Response
Here is the equivalent Python code:

```python
# Python code

n = int(input())
print(str(n) + ":", end="")
i = 2
while n >= i * i:
    if n % i == 0:
        n = n // i
        print(" " + str(i), end="")
    else:
        i += 1
print(" " + str(n))
```

This Python code does the same thing as the Java code. It reads an integer from the user, then prints the number and its prime factors. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `end=""` argument in the `print` function is used to prevent a newline from being printed after each number.<｜end▁of▁sentence｜>
