def test(self):

        warehouse = Warehouse()
        warehouse.add_product(1, 'product 5', 100)
        warehouse.create_order(1, 1, 10)
        return warehouse.track_order(1)