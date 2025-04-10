def test(self):

        tracker = StockPortfolioTracker(10000.0)
        tracker.portfolio = [{'name': 'AAPL', 'price': 150.0, 'quantity': 20}]
        return tracker.sell_stock({'name': 'AAPL', 'price': 150.0, 'quantity': 20}),tracker.portfolio,tracker.cash_balance