def test(self):

        account1 = BankAccount()
        account1.balance = 1000
        ret = account1.withdraw(500)
        return ret