def test(self):

        customer = {'name': 'John Doe', 'fidelity': 1200}
        cart = [{'product': f'product{i}', 'quantity': 1, 'price': 10.0} for i in range(5)]
        order = DiscountStrategy(customer, cart, DiscountStrategy.LargeOrderPromo)
        expected_discount = 0
        actual_discount = order.promotion(order)
        return actual_discount,expected_discount