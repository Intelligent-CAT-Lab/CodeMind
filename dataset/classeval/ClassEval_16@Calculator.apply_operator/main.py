import unittest
class Calculator:
    def __init__(self):
        self.operators = {
            '+': lambda x, y: x + y,
            '-': lambda x, y: x - y,
            '*': lambda x, y: x * y,
            '/': lambda x, y: x / y,
            '^': lambda x, y: x ** y
        }

    def calculate(self, expression):
        operand_stack = []
        operator_stack = []
        num_buffer = ''

        for char in expression:
            if char.isdigit() or char == '.':
                num_buffer += char
            else:
                if num_buffer:
                    operand_stack.append(float(num_buffer))
                    num_buffer = ''

                if char in '+-*/^':
                    while (
                            operator_stack and
                            operator_stack[-1] != '(' and
                            self.precedence(operator_stack[-1]) >= self.precedence(char)
                    ):
                        operand_stack, operator_stack = self.apply_operator(operand_stack, operator_stack)

                    operator_stack.append(char)
                elif char == '(':
                    operator_stack.append(char)
                elif char == ')':
                    while operator_stack and operator_stack[-1] != '(':
                        operand_stack, operator_stack = self.apply_operator(operand_stack, operator_stack)

                    operator_stack.pop()

        if num_buffer:
            operand_stack.append(float(num_buffer))

        while operator_stack:
            operand_stack, operator_stack = self.apply_operator(operand_stack, operator_stack)

        return operand_stack[-1] if operand_stack else None

    def precedence(self, operator):
        precedences = {
            '+': 1,
            '-': 1,
            '*': 2,
            '/': 2,
            '^': 3
        }
        return precedences.get(operator, 0)

    def apply_operator(self, operand_stack, operator_stack):
        operator = operator_stack.pop()
        if operator == '^':
            operand2 = operand_stack.pop()
            operand1 = operand_stack.pop()
            result = self.operators[operator](operand1, operand2)
            operand_stack.append(result)
        else:
            operand2 = operand_stack.pop()
            operand1 = operand_stack.pop()
            result = self.operators[operator](operand1, operand2)
            operand_stack.append(result)
        return operand_stack, operator_stack
class Test(unittest.TestCase):
    def test(self):
            calculator = Calculator()
            operand_stack = [1, 2, 3]
            operator_stack = ['+', '*']
            calculator.apply_operator(operand_stack, operator_stack)
            return operand_stack,operator_stack