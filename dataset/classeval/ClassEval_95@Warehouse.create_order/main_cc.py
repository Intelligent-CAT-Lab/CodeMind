
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

    def create_order(self, order_id, product_id, quantity):
        if self.get_product_quantity(product_id) >= quantity:
            self.update_product_quantity(product_id, -quantity)
            self.orders[order_id] = {'product_id': product_id, 'quantity': quantity, 'status': 'Shipped'}
        else:
            return False
    def update_product_quantity(self, product_id, quantity):
        if product_id in self.inventory:
            self.inventory[product_id]['quantity'] += quantity
    def get_product_quantity(self, product_id):
        if product_id in self.inventory:
            return self.inventory[product_id]['quantity']
        else:
            return False