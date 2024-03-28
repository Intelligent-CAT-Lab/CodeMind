<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02831 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A, B;
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();

		long gcd = 0;
		for (int i = 1; i < Math.max(A, B); i++) {
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		long lcm = A * B / gcd;
		System.out.println(lcm);
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def lcm(a, b):
    return a * b // gcd(a, b)

a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))

print(lcm(a, b))
```
This code uses the Euclidean algorithm to find the greatest common divisor (GCD) of two numbers, and then uses that GCD to find the least common multiple (LCM) of the two numbers. The `gcd` function is a recursive function that takes two integers `a` and `b` as input, and returns the GCD of `a` and `b`. The `lcm` function is a function that takes two integers `a` and `b` as input, and returns the LCM of `a` and `b`.

The code first prompts the user to enter two numbers, and then uses the `gcd` function to find the GCD of the two numbers. It then uses the `lcm` function to find the LCM of the two numbers, and prints the result.

Note that this code assumes that the input numbers are positive integers. If the input numbers are not positive integers, the code may not work correctly.</s>
