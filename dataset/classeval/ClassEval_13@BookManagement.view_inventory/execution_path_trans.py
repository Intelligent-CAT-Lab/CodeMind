
import sys
import trace
import os
import unittest
class BookManagement:
    def __init__(self):
        self.inventory = {}

    def add_book(self, title, quantity=1):
        if title in self.inventory:
            self.inventory[title] += quantity
        else:
            self.inventory[title] = quantity

    def remove_book(self, title, quantity):
        if title not in self.inventory or self.inventory[title] < quantity:
            raise False
        self.inventory[title] -= quantity
        if self.inventory[title] == 0:
            del (self.inventory[title])

    def view_inventory(self):
        return self.inventory

    def view_book_quantity(self, title):
        if title not in self.inventory:
            return 0
        return self.inventory[title]
class Test(unittest.TestCase):
    def test(self):
            bookManagement = BookManagement()
            bookManagement.add_book("book1", 2)
            bookManagement.add_book("book2")
            expected = {"book1": 2, "book2": 1}
            return expected,bookManagement.inventory
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_13@BookManagement.view_inventory/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
