def test(self):
        return SQLQueryBuilder.delete('items', {'name': 'bbb'})