
class ShoppingCart: 
    def __init__(self):
        """
        Initialize the items representing the shopping list as an empty dictionary
        """
        self.items = {}


    def view_items(self) -> dict:
        return self.items