def test(self):
        return SQLQueryBuilder.insert('students', {'name': 'Tom', 'age': 18})