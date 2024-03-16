<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import re

def solve(equation):
    equation = re.sub(r'[+-]', ' \g<0> ', equation)
    equation = re.sub(r'[x^]', ' \g<0> ', equation)
    equation = re.sub(r'([0-9]+)', ' \g<0> ', equation)
    equation = equation.split()

    coeffs = [0]*6
    for i in range(0, len(equation), 2):
        coeff = int(equation[i+1]) if equation[i+1] != 'x' else 1
        if equation[i] == '+':
            coeffs[0] += coeff
        elif equation[i] == '-':
            coeffs[0] -= coeff
        elif equation[i] == '^':
            coeffs[int(equation[i+2])] = coeff if equation[i-1] == '+' else -coeff

    ji = 0
    for i in range(5, -1, -1):
        if coeffs[i] != 0:
            ji = i
            break

    ans = [0]*ji
    for i in range(1, abs(coeffs[0])+1):
        result = 0
        for j in range(6):
            result += i**j * coeffs[j]
        if result == 0:
            ji -= 1
            ans[ji] = -i
        result = 0
        for j in range(6):
            result += (-i)**j * coeffs[j]
        if result == 0:
            ji -= 1
            ans[ji] = i

    ans.sort()
    return ''.join(f'({"+" if a>=0 else ""}{a}x)' for a in ans)

equation = input()
print(solve(equation))
```

This Python code does the same thing as the Java code. It first splits the input equation into a list of terms, then calculates the coefficients of each term and stores them in a list. It then finds the highest power of x in the equation and generates all possible solutions for x. Finally, it sorts the solutions and prints them.<｜end▁of▁sentence｜>
