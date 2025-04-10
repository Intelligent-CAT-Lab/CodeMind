def test(self):
        self.expression_calculator = ExpressionCalculator()
        result = self.expression_calculator.transform("2 + 3 * 4")
        return result