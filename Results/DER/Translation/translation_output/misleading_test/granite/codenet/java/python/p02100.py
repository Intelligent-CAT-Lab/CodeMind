System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import re

def polynomial_root(polynomial):
    pattern = r"([+-]?[0-9]*\.?[0-9]+)"
    coefficients = [float(x) for x in re.findall(pattern, polynomial)]
    degree = len(coefficients) - 1
    ans = []
    for i in range(1, int(abs(coefficients[0])) + 1):
        result = 0
        for j in range(degree + 1):
            result += coefficients[j] * (i ** j)
        if result == 0:
            ans.append(-i)
        result = 0
        for j in range(degree + 1):
            result += coefficients[j] * ((-i) ** j)
        if result == 0:
            ans.append(i)
    ans.sort()
    return [f"(x{sign}{abs(x)})" for x in ans for sign in ["+", "-"]]
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "x^2+3x+2",
    "x^3-2x^2+x-2",
    "x^4+2x^3+3x^2+2x+1",
]
expected_outputs = [
    ["(x+1)(x+2)", "(x-1)(x-2)"],
    ["(x+1)(x-2)(x+1)"],
    ["(x+1)"],
]
for i in range(len(test_inputs)):
    assert polynomial_root(test_inputs[i]) == expected_outputs[i]
```<|endoftext|>
