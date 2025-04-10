
class ShoppingCart: 
    def __init__(self):
        """
        Initialize the items representing the shopping list as an empty dictionary
        """
        self.items = {}


    def add_item(self, item, price, quantity=1):
        if item in self.items:
            self.items[item] = {'price': price, 'quantity': quantity}
        else:
            self.items[item] = {'price': price, 'quantity': quantity}