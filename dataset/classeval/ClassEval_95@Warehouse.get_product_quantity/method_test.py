def test(self):

        warehouse = Warehouse()
        warehouse.add_product(1, 'product 1', 5)
        return warehouse.get_product_quantity(1)