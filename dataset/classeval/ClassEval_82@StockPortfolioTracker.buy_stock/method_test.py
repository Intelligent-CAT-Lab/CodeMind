def test(self):
        tracker = StockPortfolioTracker(10000.0)
        tracker.portfolio = [{'name': 'AAPL', 'price': 150.0, 'quantity': 10}]
        return tracker.buy_stock({'name': 'MSFT', 'price': 150.0, 'quantity': 10}),tracker.buy_stock({'name': 'MSFT', 'price': 150.0, 'quantity': 10}),tracker.portfolio,tracker.cash_balance