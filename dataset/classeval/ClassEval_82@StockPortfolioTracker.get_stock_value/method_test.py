def test(self):

        tracker = StockPortfolioTracker(10000.0)
        return tracker.get_stock_value({'name': 'AAPL', 'price': 0.0, 'quantity': 10})