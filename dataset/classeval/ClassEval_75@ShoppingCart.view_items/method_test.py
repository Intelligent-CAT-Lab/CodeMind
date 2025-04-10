def test(self):

        shoppingcart = ShoppingCart()
        shoppingcart.add_item("apple", 1, 2)
        return shoppingcart.view_items()