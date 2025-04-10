def test(self):
        self.expression_calculator = ExpressionCalculator()
        self.expression_calculator.prepare("2-3*4")
        return self.expression_calculator.postfix_stack,deque(['2', '3', '4', '*', '-'])