import unittest
class StockPortfolioTracker:
    def __init__(self, cash_balance):
        self.portfolio = []
        self.cash_balance = cash_balance

    def add_stock(self, stock):
        for pf in self.portfolio:
            if pf['name'] == stock['name']:
                pf['quantity'] += stock['quantity']
                return

        self.portfolio.append(stock)

    def remove_stock(self, stock):
        for pf in self.portfolio:
            if pf['name'] == stock['name'] and pf['quantity'] >= stock['quantity']:
                pf['quantity'] -= stock['quantity']
                if pf['quantity'] == 0:
                    self.portfolio.remove(pf)
                return True
        return False

    def buy_stock(self, stock):
        if stock['price'] * stock['quantity'] > self.cash_balance:
            return False
        else:
            self.add_stock(stock)
            self.cash_balance -= stock['price'] * stock['quantity']
            return True

    def sell_stock(self, stock):
        if self.remove_stock(stock) == False:
            return False
        self.cash_balance += stock['price'] * stock['quantity']
        return True

    def calculate_portfolio_value(self):
        total_value = self.cash_balance
        for stock in self.portfolio:
            total_value += stock['price'] * stock['quantity']
        return total_value

    def get_portfolio_summary(self):
        summary = []
        for stock in self.portfolio:
            value = self.get_stock_value(stock)
            summary.append({"name": stock["name"], "value": value})
        portfolio_value = self.calculate_portfolio_value()
        return portfolio_value, summary

    def get_stock_value(self, stock):
        return stock['price'] * stock['quantity']
class Test(unittest.TestCase):
    def test(self):
            tracker = StockPortfolioTracker(10000.0)
            tracker.portfolio = [{'name': 'AAPL', 'price': 150.0, 'quantity': 10}]
            tracker.add_stock({"name": "AAPL", "price": 150.0, "quantity": 10})
            tracker.add_stock({"name": "MSFT", "price": 150.0, "quantity": 10})
            return tracker.portfolio