def test(self):

        calculator = Calculator()
        operand_stack = [1, 2, 3]
        operator_stack = ['+', '*']
        calculator.apply_operator(operand_stack, operator_stack)
        return operand_stack,operator_stack