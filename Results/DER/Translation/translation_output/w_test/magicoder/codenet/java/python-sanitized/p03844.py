import re

def calculate(expression):
    num1, operator, num2 = map(str, re.split('([-+])', expression))
    num1, num2 = int(num1), int(num2)
    if operator == '+':
        return num1 + num2
    elif operator == '-':
        return num1 - num2

# Test input
print(calculate('1 + 2'))