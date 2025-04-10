
class Warehouse: 
    def __init__(self):
        """
        Initialize two fields.
        self.inventory is a dict that stores the products.
        self.inventory = {Product ID: Product}
        self.orders is a dict that stores the products in a order.
        self.orders = {Order ID: Order}
        """
        self.inventory = {}  # Product ID: Product
        self.orders = {}  # Order ID: Order

    def get_product_quantity(self, product_id):
        if product_id in self.inventory:
            return self.inventory[product_id]['quantity']
        else:
            return False