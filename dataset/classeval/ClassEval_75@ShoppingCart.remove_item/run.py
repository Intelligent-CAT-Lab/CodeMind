import os
import unittest
class ShoppingCart:
    def __init__(self):
        self.items = {}

    def add_item(self, item, price, quantity=1):
        if item in self.items:
            self.items[item] = {'price': price, 'quantity': quantity}
        else:
            self.items[item] = {'price': price, 'quantity': quantity}

    def remove_item(self, item, quantity=1):
        if item in self.items:
            self.items[item]['quantity'] -= quantity
        else:
            pass

    def view_items(self) -> dict:
        return self.items

    def total_price(self) -> float:
        return sum([item['quantity'] * item['price'] for item in self.items.values()])
class Test(unittest.TestCase):
    def test(self):
            shoppingcart = ShoppingCart()
            shoppingcart.add_item("apple", 1, 5)
            shoppingcart.remove_item("banana", 4)
            return shoppingcart.items
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_75@ShoppingCart.remove_item/output.txt', 'w') as wr:
    wr.write(str(a))
        