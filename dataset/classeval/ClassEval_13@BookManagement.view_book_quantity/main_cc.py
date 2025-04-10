
class BookManagement: 
    def __init__(self):
        """
        Initialize the inventory of Book Manager.
        """
        self.inventory = {}

    def view_book_quantity(self, title):
        if title not in self.inventory:
            return 0
        return self.inventory[title]