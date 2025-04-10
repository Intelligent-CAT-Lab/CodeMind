def test(self):

        vendingMachine = VendingMachine()
        vendingMachine.inventory = {'Coke': {'price': 1.25, 'quantity': 10}, 'Pizza': {'price': 1.25, 'quantity': 10}}
        return vendingMachine.restock_item('Pizza', 10),vendingMachine.inventory