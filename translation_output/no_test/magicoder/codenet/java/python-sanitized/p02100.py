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