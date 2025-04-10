
class ShoppingCart: 
    def __init__(self):
        """
        Initialize the items representing the shopping list as an empty dictionary
        """
        self.items = {}


    def total_price(self) -> float:
        return sum([item['quantity'] * item['price'] for item in self.items.values()])