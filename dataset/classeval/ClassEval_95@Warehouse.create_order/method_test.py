def test(self):

        warehouse = Warehouse()
        warehouse.add_product(1, 'product 4', 5)
        warehouse.create_order(1, 1, 5)
        return warehouse.orders