<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import re
import sys

def solve(equation):
    equation = equation.replace(" ", "")
    match = re.findall(r'[-+]?[0-9]*x\^[0-9]+|[-+]?[0-9]*x|[-+]?[0-9]+', equation)
    coefficients = [0]*6
    for term in match:
        if 'x^' in term:
            coef, power = term.split('x^')
            if coef == '':
                coef = '1'
            coefficients[int(power)] = int(coef)
        elif 'x' in term:
            coef = term.split('x')[0]
            if coef == '':
                coef = '1'
            coefficients[1] = int(coef)
        else:
            coefficients[0] = int(term)
    roots = []
    for i in range(-100, 101):
        result = sum(coef * i ** power for power, coef in enumerate(coefficients))
        if result == 0:
            roots.append(i)
    roots.sort()
    return " ".join(f"({x})" for x in roots)

equation = input()
print(solve(equation))
```

This Python code takes an equation as input, splits it into terms based on the 'x^', 'x', and numbers, and stores the coefficients in an array. It then iterates over the range of possible roots, calculates the result of the equation for each root, and if the result is 0, it adds the root to the list of roots. Finally, it sorts the list of roots and returns them as a string.
<|EOT|>
