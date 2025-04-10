
class BookManagement: 
    def __init__(self):
        """
        Initialize the inventory of Book Manager.
        """
        self.inventory = {}

    def add_book(self, title, quantity=1):
        if title in self.inventory:
            self.inventory[title] += quantity
        else:
            self.inventory[title] = quantity