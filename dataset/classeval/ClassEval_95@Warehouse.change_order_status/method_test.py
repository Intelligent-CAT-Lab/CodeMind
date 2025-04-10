def test(self):

        warehouse = Warehouse()
        result = warehouse.change_order_status(1, 'Delivered')
        return result