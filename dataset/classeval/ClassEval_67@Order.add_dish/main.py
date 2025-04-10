import unittest
class Order:

    def __init__(self):
        self.menu = []
        # menu = [{"dish": dish name, "price": price, "count": count}, ...]
        self.selected_dishes = []
        # selected_dish = {"dish": dish name, "count": count, price: price}
        self.sales = {}
        # 


    def add_dish(self, dish):
        for menu_dish in self.menu:
            if dish["dish"] == menu_dish["dish"]:
                if menu_dish["count"] < dish["count"]:
                    return False
                else:
                    menu_dish["count"] -= dish["count"]
                    break
        self.selected_dishes.append(dish)
        return True

    def calculate_total(self):
        total = 0
        for dish in self.selected_dishes:
            total += dish["price"] * dish["count"] * self.sales[dish["dish"]]
        return total

    def checkout(self):
        if len(self.selected_dishes) == 0:
            return False
        total = self.calculate_total()
        self.selected_dishes = []
        return total
class Test(unittest.TestCase):
    def test(self):
            self.order = Order()
            self.order.menu.append({"dish": "dish1", "price": 10, "count": 5})
            self.order.menu.append({"dish": "dish2", "price": 15, "count": 3})
            self.order.menu.append({"dish": "dish3", "price": 20, "count": 7})
            self.order.sales = {"dish1": 0.9, "dish2": 1, "dish3": 0.8}
            self.order.menu = []
            result = self.order.add_dish({})
            return result