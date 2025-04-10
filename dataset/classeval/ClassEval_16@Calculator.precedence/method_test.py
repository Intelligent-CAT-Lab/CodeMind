def test(self):

        calculator = Calculator()
        res1 = calculator.precedence('+')
        res2 = calculator.precedence('-')
        return res1,res2