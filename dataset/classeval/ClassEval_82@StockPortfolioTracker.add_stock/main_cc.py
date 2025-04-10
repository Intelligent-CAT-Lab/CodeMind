
class StockPortfolioTracker: 
    def __init__(self, cash_balance):
        """
        Initialize the StockPortfolioTracker class with a cash balance and an empty portfolio.
        """
        self.portfolio = []
        self.cash_balance = cash_balance

    def add_stock(self, stock):
        for pf in self.portfolio:
            if pf['name'] == stock['name']:
                pf['quantity'] += stock['quantity']
                return

        self.portfolio.append(stock)