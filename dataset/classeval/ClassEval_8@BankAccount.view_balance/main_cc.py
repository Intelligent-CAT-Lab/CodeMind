
class BankAccount: 
    def __init__(self, balance=0):
        """
        Initializes a bank account object with an attribute balance, default value is 0.
        """
        self.balance = balance

    def view_balance(self):
        return self.balance