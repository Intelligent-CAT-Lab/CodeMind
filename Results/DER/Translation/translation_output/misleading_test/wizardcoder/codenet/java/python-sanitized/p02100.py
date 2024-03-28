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