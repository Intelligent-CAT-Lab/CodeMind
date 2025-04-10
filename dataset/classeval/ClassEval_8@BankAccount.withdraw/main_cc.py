
class BankAccount: 
    def __init__(self, balance=0):
        """
        Initializes a bank account object with an attribute balance, default value is 0.
        """
        self.balance = balance

    def withdraw(self, amount):
        if amount < 0:
            raise ValueError("Invalid amount")
        if amount > self.balance:
            raise ValueError("Insufficient balance.")
        self.balance -= amount
        return self.balance