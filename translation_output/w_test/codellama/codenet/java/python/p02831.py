<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6


```
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
```
[/INST]
```
import math

def get_lcm(a, b):
    gcd = 0
    for i in range(1, max(a, b)):
        if a % i == 0 and b % i == 0:
            gcd = i
    return a * b // gcd

a, b = map(int, input().split())
print(get_lcm(a, b))
```
This code uses the same approach as the Java code, but it is written in Python. It first defines a function `get_lcm` that takes two integers `a` and `b` as input and returns their least common multiple. The function uses a for loop to iterate from 1 to the maximum of `a` and `b`, and checks if both numbers are divisible by each number. If they are, the function sets `gcd` to that number and breaks out of the loop. Finally, the function returns the least common multiple, which is calculated as `a * b // gcd`.

The main part of the code then reads two integers from the input, calls the `get_lcm` function with those integers as arguments, and prints the result.</s>
