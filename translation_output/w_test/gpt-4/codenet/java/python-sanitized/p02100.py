from sympy import symbols, solve

def parse_equation(equation):
    # Parsing the equation to get coefficients using sympy
    x = symbols('x')
    expr = equation.replace('^', '**')
    # Solve the equation
    roots = solve(expr, x)
    
    # Format the roots in the expected output format
    output = ''
    for root in roots:
        if root >= 0:
            output += f'(x-{root})'
        else:
            output += f'(x+{-root})'
    
    return output

# Test case
input_equation = 'x^2+3x+2'
output = parse_equation(input_equation)
print(output)  # Expected output: (x+1)(x+2)