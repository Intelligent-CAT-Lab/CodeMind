<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

n = int(sys.stdin.readline())
print(n, end=":")

for i in range(2, int(n**0.5) + 1):
    if n % i == 0:
        n = n // i
        print(" ", i, end="")

print(" ", n)
```
This code reads a number `n` from standard input, and then prints the prime factors of `n` in the format "n: p1 p2 ... pk", where p1, p2, ..., pk are the prime factors of `n`.

The code uses a for loop to iterate over the possible prime factors of `n`, starting from 2 and increasing by 1 until the square root of `n`. For each prime factor `i`, it checks if `n` is divisible by `i`, and if so, it divides `n` by `i` and prints the factor.

The `end=""` parameter in the `print` function is used to prevent the newline character from being printed after each factor, so that the factors are printed on the same line.

The `int(n**0.5)` expression is used to calculate the square root of `n`, which is the highest possible prime factor of `n`. This is because if a number `n` has a prime factor `p` greater than its square root, then `n/p` must also be a prime factor of `n`, which contradicts the fact that `p` is the highest possible prime factor of `n`.</s>
