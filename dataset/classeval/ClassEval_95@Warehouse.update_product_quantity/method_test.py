def test(self):

        warehouse = Warehouse()
        warehouse.add_product(1, 'product 1', 10)
        warehouse.update_product_quantity(1, 5)
        return warehouse.inventory