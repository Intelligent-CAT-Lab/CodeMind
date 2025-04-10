def test(self):

        vendingMachine = VendingMachine()
        vendingMachine.inventory = {'Coke': {'price': 1.25, 'quantity': 10}}
        vendingMachine.balance = 0
        return vendingMachine.purchase_item('Coke'),vendingMachine.inventory