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