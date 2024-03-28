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