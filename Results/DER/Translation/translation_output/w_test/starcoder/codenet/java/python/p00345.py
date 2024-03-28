<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import re

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b / gcd(a, b))

def irreducible_fractionalization(s):
    if re.search(r'\.', s):
        a, b = s.split('.')
        a = int(a)
        b = int(b)
        d = lcm(a, b)
        n = a * (d / a) + b * d / b
        g = gcd(n, d)
        n /= g
        d /= g
        return '%d/%d' % (n, d)
    else:
        return '%d/1' % int(s)

if __name__ == '__main__':
    s = input()
    print(irreducible_fractionalization(s))
```
<|endoftext|>
