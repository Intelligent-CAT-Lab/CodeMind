def test(self):
        return SQLQueryBuilder.select('students', ['id', 'name'], {'age': 18})