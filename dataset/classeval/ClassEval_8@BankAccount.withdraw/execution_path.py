
import sys
import trace
import os
import unittest
class BankAccount:
    def __init__(self, balance=0):
        self.balance = balance

    def deposit(self, amount):
        if amount < 0:
            raise ValueError("Invalid amount")
        self.balance += amount
        return self.balance

    def withdraw(self, amount):
        if amount < 0:
            raise ValueError("Invalid amount")
        if amount > self.balance:
            raise ValueError("Insufficient balance.")
        self.balance -= amount
        return self.balance

    def view_balance(self):
        return self.balance

    def transfer(self, other_account, amount):
        self.withdraw(amount)
        other_account.deposit(amount)
class Test(unittest.TestCase):
    def test(self):
            account1 = BankAccount()
            account1.balance = 1000
            ret = account1.withdraw(500)
            return ret
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_8@BankAccount.withdraw/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
