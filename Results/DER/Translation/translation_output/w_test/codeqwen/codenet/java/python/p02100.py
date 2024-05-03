Here is the Python version of the Java code:

```python
import re

def solve_polynomial(equation):
    coefficients = [0] * 6
    num = 0
    plus = True
    si = False
    xs = False
    for c in equation:
        if c == '+':
            if xs:
                if plus:
                    coefficients[1] = num
                else:
                    coefficients[1] = -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                if plus:
                    coefficients[1] = num
                else:
                    coefficients[1] = -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = int(c)
                if plus:
                    coefficients[v] = num
                else:
                    coefficients[v] = -num
                si = False
            else:
                num = num * 10 + int(c)
    if plus:
        coefficients[0] = num
    else:
        coefficients[0] = -num
    ji = 0
    for i in range(5, -1, -1):
        if coefficients[i] != 0:
            ji = i
            break
    ans = []
    for i in range(1, abs(coefficients[0]) + 1):
        result = 0
        for j in range(6):
            result += (i ** j) * coefficients[j]
        if result == 0:
            ans.append(-i)
            ji -= 1
        result = 0
        for j in range(6):
            result += ((-i) ** j) * coefficients[j]
        if result == 0:
            ans.append(i)
            ji -= 1
    ans.
