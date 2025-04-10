
class DiscountStrategy: 
    def __init__(self, customer, cart, promotion=None):
        """
        Initialize the DiscountStrategy with customer information, a cart of items, and an optional promotion.
        :param customer: dict, customer information
        :param cart: list of dicts, a cart of items with details
        :param promotion: function, optional promotion applied to the order
        >>> customer = {'name': 'John Doe', 'fidelity': 1200}
        >>> cart = [{'product': 'product', 'quantity': 14, 'price': 23.5}]
        >>> DiscountStrategy(customer, cart, DiscountStrategy.FidelityPromo)

        """
        self.customer = customer
        self.cart = cart
        self.promotion = promotion
        self.total()

    def due(self):
        if self.promotion is None:
            discount = 0
        else:
            discount = self.promotion(self)
        return self.__total - discount
    def total(self):
        self.__total = sum(item['quantity'] * item['price'] for item in self.cart)
        return self.__total