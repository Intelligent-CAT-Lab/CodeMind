def test(self):

        tracker = StockPortfolioTracker(10000.0)
        tracker.portfolio = [{'name': 'AAPL', 'price': 150.0, 'quantity': 10},
                             {'name': 'MSFT', 'price': 150.0, 'quantity': 10}]
        return tracker.remove_stock({'name': 'AAPL', 'price': 150.0, 'quantity': 10}),tracker.portfolio