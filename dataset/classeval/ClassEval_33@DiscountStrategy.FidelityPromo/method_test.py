def test(self):

        customer = {'name': 'John Doe', 'fidelity': 1800}
        cart = [{'product': 'product1', 'quantity': 10, 'price': 20.0},
                {'product': 'product2', 'quantity': 5, 'price': 10.0}]
        order = DiscountStrategy(customer, cart, DiscountStrategy.FidelityPromo)
        expected_discount = 12.5
        actual_discount = order.promotion(order)
        return actual_discount,expected_discount