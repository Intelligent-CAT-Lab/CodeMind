import os
import unittest
class DiscountStrategy:
    def __init__(self, customer, cart, promotion=None):
        self.customer = customer
        self.cart = cart
        self.promotion = promotion
        self.__total = self.total()

    def total(self):
        self.__total = sum(item['quantity'] * item['price'] for item in self.cart)
        return self.__total

    def due(self):
        if self.promotion is None:
            discount = 0
        else:
            discount = self.promotion(self)
        return self.__total - discount

    @staticmethod
    def FidelityPromo(order):
        return order.total() * 0.05 if order.customer['fidelity'] >= 1000 else 0

    @staticmethod
    def BulkItemPromo(order):
        discount = 0
        for item in order.cart:
            if item['quantity'] >= 20:
                discount += item['quantity'] * item['price'] * 0.1
        return discount

    @staticmethod
    def LargeOrderPromo(order):
        return order.total() * 0.07 if len({item['product'] for item in order.cart}) >= 10 else 0
class Test(unittest.TestCase):
    def test(self):
            customer = {'name': 'John Doe', 'fidelity': 1800}
            cart = [{'product': 'product1', 'quantity': 10, 'price': 20.0},
                    {'product': 'product2', 'quantity': 5, 'price': 10.0}]
            order = DiscountStrategy(customer, cart, DiscountStrategy.FidelityPromo)
            expected_discount = 12.5
            actual_discount = order.promotion(order)
            return actual_discount,expected_discount
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_33@DiscountStrategy.FidelityPromo/output.txt', 'w') as wr:
    wr.write(str(a))
        