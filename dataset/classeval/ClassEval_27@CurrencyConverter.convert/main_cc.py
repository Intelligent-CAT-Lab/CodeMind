
class CurrencyConverter: 
    def __init__(self):
        """
        Initialize the exchange rate of the US dollar against various currencies
        """
        self.rates = {
            'USD': 1.0,
            'EUR': 0.85,
            'GBP': 0.72,
            'JPY': 110.15,
            'CAD': 1.23,
            'AUD': 1.34,
            'CNY': 6.40,
        }

    def convert(self, amount, from_currency, to_currency):
        if from_currency == to_currency:
            return amount

        if from_currency not in self.rates or to_currency not in self.rates:
            return False

        from_rate = self.rates[from_currency]
        to_rate = self.rates[to_currency]

        converted_amount = (amount / from_rate) * to_rate
        return converted_amount