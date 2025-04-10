def test(self):

        shoppingcart = ShoppingCart()
        shoppingcart.add_item("apple", 1, 5)
        shoppingcart.remove_item("banana", 4)
        return shoppingcart.items