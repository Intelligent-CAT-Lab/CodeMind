Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
		    if (keis[i]!= 0) {
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

def solve(equation):
    # Replace all the powers of x with x^n
    equation = re.sub(r'(?<![x^])(\d+)', r'x^\1', equation)
    # Replace all the negative signs with a plus sign
    equation = re.sub(r'-', r'+-', equation)
    # Split the equation into terms
    terms = equation.split('+')
    # Initialize the coefficients and exponents of each term
    coeffs = [0] * 6
    exponents = [0] * 6
    # Parse each term and update the coefficients and exponents
    for term in terms:
        if '^' in term:
            # Parse the term as x^n
            x, n = term.split('^')
            n = int(n)
            # Update the coefficients and exponents
            coeffs[n] = int(x)
        else:
            # Parse the term as a constant
            coeffs[0] += int(term)
    # Initialize the result
    result = ''
    # Iterate over the coefficients and exponents in descending order
    for i in range(5, -1, -1):
        if coeffs[i]!= 0:
            # Add the term to the result
            if coeffs[i] > 0:
                result += '+'
            result += str(coeffs[i])
            if i > 1:
                result += 'x^' + str(i)
            elif i == 1:
                result += 'x'
            elif i == 0:
                result += str(coeffs[0])
    # Replace all the plus signs with a minus sign
    result = re.sub(r'\+', r'-', result)
    # Replace all the x^0 with an empty string
    result = re.sub(r'x\^0', r'', result)
    # Replace all the x^1 with an empty string
    result = re.sub(r'x\^1', r'', result)
    # Replace all the x^2 with an empty string
    result = re.sub(r'x\^2', r'', result)
    # Replace all the x^3 with an empty string
    result = re.sub(r'x\^3', r'', result)
    # Replace all the x^4 with an empty string
    result = re.sub(r'x\^4', r'', result)
    # Replace all the x^5 with an empty string
    result = re.sub(r'x\^5', r'', result)
    # Replace all the empty strings with a single space
    result = re.sub(r'\s+', r' ', result)
    # Remove the leading plus sign
    result = result.lstrip('+')
    # Replace all the remaining plus signs with a comma
    result = re.sub(r'\+', r',', result)
    # Replace all the remaining minus signs with a closing parenthesis
    result = re.sub(r'-', r')', result)
    # Replace all the remaining commas with an opening parenthesis
    result = re.sub(r',', r'(', result)
    # Add the opening and closing parenthesis
    result = '(' + result + ')'
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with a closing parenthesis
    result = re.sub(r',', r')', result)
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with an opening parenthesis
    result = re.sub(r',', r'(', result)
    # Add the opening and closing parenthesis
    result = '(' + result + ')'
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with a closing parenthesis
    result = re.sub(r',', r')', result)
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with an opening parenthesis
    result = re.sub(r',', r'(', result)
    # Add the opening and closing parenthesis
    result = '(' + result + ')'
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with a closing parenthesis
    result = re.sub(r',', r')', result)
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with an opening parenthesis
    result = re.sub(r',', r'(', result)
    # Add the opening and closing parenthesis
    result = '(' + result + ')'
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with a closing parenthesis
    result = re.sub(r',', r')', result)
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with an opening parenthesis
    result = re.sub(r',', r'(', result)
    # Add the opening and closing parenthesis
    result = '(' + result + ')'
    # Replace all the remaining spaces with a comma
    result = re.sub(r'\s+', r',', result)
    # Replace all the remaining commas with a closing parenthesis
    result = re.sub(r',', r')', result)
    # Replace
