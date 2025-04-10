def test(self):

        cc = CurrencyConverter()
        cc.update_currency_rate('CNY', 3.0)
        return cc.rates['CNY']