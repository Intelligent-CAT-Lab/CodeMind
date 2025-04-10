def test(self):
        return SQLQueryBuilder.update('items', {'price': 1.0}, {'name': 'aaa'})