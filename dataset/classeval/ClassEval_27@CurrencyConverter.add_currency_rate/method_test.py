def test(self):

        cc = CurrencyConverter()
        cc.add_currency_rate('aaa', 1.0)
        return cc.rates['aaa']