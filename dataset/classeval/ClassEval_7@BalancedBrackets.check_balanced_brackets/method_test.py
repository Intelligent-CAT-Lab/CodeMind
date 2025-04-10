def test(self):

        b = BalancedBrackets("a(b{c]]")
        return b.check_balanced_brackets()