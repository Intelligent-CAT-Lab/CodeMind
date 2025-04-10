def test(self):

        b = BalancedBrackets("[a](b){c}")
        b.clear_expr()
        return b.expr