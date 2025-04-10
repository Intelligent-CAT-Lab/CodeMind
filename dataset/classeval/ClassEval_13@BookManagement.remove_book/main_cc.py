
class BookManagement: 
    def __init__(self):
        """
        Initialize the inventory of Book Manager.
        """
        self.inventory = {}

    def remove_book(self, title, quantity):
        if title not in self.inventory or self.inventory[title] < quantity:
            raise False
        self.inventory[title] -= quantity
        if self.inventory[title] == 0:
            del (self.inventory[title])