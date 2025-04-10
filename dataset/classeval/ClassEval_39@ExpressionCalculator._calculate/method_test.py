def test(self):
        self.expression_calculator = ExpressionCalculator()
        result = self.expression_calculator._calculate("2", "3", "*")
        return result,Decimal(6.0)