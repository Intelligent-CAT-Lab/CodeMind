
class VendingMachine: 
    def __init__(self):
        """
        Initializes the vending machine's inventory and balance.
        """
        self.inventory = {}
        self.balance = 0

    def add_item(self, item_name, price, quantity):
        if not self.restock_item(item_name, quantity):
            self.inventory[item_name] = {'price': price, 'quantity': quantity}
    def restock_item(self, item_name, quantity):
        if item_name in self.inventory:
            self.inventory[item_name]['quantity'] += quantity
            return True
        else:
            return False