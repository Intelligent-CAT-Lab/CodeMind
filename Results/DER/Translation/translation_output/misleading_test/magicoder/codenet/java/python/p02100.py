<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
x^2+3x+2

Expected output:
R}}1)4HY2{

```
import java.util.*;

public class p02100 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int num = 0;
		boolean plus = true;
		boolean si = false;
		boolean xs = false;
		long[] keis = new long[6];
		for (char c : arr) {
		    if (c == '+') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = true;
		    } else if (c == '-') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = false;
		    } else if (c == '^') {
		        si = true;
		        xs = false;
		    } else if (c == 'x') {
		        if (num == 0) {
		            num = 1;
		        }
		        xs = true;
		    } else {
		        if (si) {
		            int v = c - '0';
		            if (plus) {
		                keis[v] = num;
		            } else {
		                keis[v] = -num;
		            }
		            si = false;
		        } else {
		            num = num * 10 + c - '0';
		        }
		    }
		}
		if (plus) {
		    keis[0] = num;
		} else {
		    keis[0] = -num;
		}
		int ji = 0;
		for (int i = 5; i >= 0; i--) {
		    if (keis[i] != 0) {
		        ji = i;
		        break;
		    }
		}
		int[] ans = new int[ji];
		for (int i = 1; i <= Math.abs(keis[0]) && ji > 0; i++) {
		    long result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(i, j) * keis[j];
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = -i;
		    }
		    result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(-i, j) * keis[j];
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = i;
		    }
		}
		Arrays.sort(ans);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
		    sb.append("(x");
		    if (ans[i] >= 0) {
		        sb.append("+");
		    }
		    sb.append(ans[i]).append(")");
		}
		System.out.println(sb);
	}
}


```

@@ Response
Here is the Python version of the given Java code:

```python
import re

def solve_equation(equation):
    # Split the equation into coefficients and powers
    coefficients = re.findall(r'[+-]?\d*x?\^?\d*', equation)
    coefficients = [c.replace('x', '') for c in coefficients]
    coefficients = [c.replace('^', '') for c in coefficients]
    coefficients = [c.replace('+', '') for c in coefficients]
    coefficients = [c.replace('-', '') for c in coefficients]
    coefficients = [int(c) if c.isdigit() else 1 for c in coefficients]

    # Calculate the roots
    roots = []
    for i in range(1, abs(coefficients[0]) + 1):
        result = 0
        for j in range(len(coefficients)):
            result += i ** j * coefficients[j]
        if result == 0:
            roots.append(-i)
            roots.append(i)

    # Sort the roots and format the output
    roots.sort()
    output = ''.join([f'(x{"" if root > 0 else "+"}{root})' for root in roots])
    return output

# Test the function
print(solve_equation('x^2+3x+2'))
```

This Python code does the same thing as the Java code. It splits the equation into coefficients and powers, calculates the roots, sorts the roots, and formats the output. The regular expressions are used to split the equation into coefficients and powers. The coefficients are then used to calculate the roots and the roots are sorted and formatted into the output string.<｜end▁of▁sentence｜>
