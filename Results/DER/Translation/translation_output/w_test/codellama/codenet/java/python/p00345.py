<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0.(3)

Expected output:
1/3


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Irreducible Fractionalization
 */
public class p00345 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] units;

		int an, ad, bn, bd;
		an = 0; //éå¾ªç°ç¯åå­
		ad = 1; //éå¾ªç°ç¯åæ¯
		bn = 0; //å¾ªç°ç¯åå­
		bd = 1; //å¾ªç°ç¯åæ¯

		line = br.readLine();

		//
		units = line.split("[()]");

		if (units.length == 2) {
			bn = parseInt(units[1]);
			bd = ((int) Math.pow(10, units[1].length())) - 1;
		}

		//
		units = units[0].split("\\.");

		if (units.length == 2) {
			bd *= (int) Math.pow(10, units[1].length());
			an = parseInt(units[0] + units[1]);
			ad = (int) Math.pow(10, units[1].length());
		} else {
			an = parseInt(units[0]);
		}

		//
		int n, d, g;
		d = lcm(ad, bd);
		n = an * (d / ad) + bn * d / bd;
		g = gcd(n, d);
		n /= g;
		d /= g;

		System.out.printf("%d/%d\n", n, d);
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}
}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b / gcd(a, b))

def main():
    line = input("Enter a fraction: ")
    units = line.split("[()]")

    if len(units) == 2:
        bn = int(units[1])
        bd = (10 ** len(units[1])) - 1
    else:
        bn = 0
        bd = 1

    units = units[0].split(".")

    if len(units) == 2:
        bd *= (10 ** len(units[1]))
        an = int(units[0] + units[1])
        ad = (10 ** len(units[1]))
    else:
        an = int(units[0])

    n, d, g = 0, 0, 0
    d = lcm(ad, bd)
    n = an * (d / ad) + bn * d / bd
    g = gcd(n, d)
    n /= g
    d /= g

    print(f"{n}/{d}")

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `math` module to perform mathematical operations, such as exponentiation and greatest common divisor (GCD). The `gcd` and `lcm` functions are defined in the Python code, and they are used to compute the GCD and least common multiple (LCM) of two integers, respectively. The `main` function is the entry point of the program, and it reads a fraction from the user, splits it into its numerator and denominator, and then computes the GCD and LCM of the two integers. Finally, the program prints the result in the form of a fraction.</s>
