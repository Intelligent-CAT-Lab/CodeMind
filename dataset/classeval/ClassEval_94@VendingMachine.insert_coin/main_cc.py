
class VendingMachine: 
    def __init__(self):
        """
        Initializes the vending machine's inventory and balance.
        """
        self.inventory = {}
        self.balance = 0

    def insert_coin(self, amount):
        self.balance += amount
        return self.balance