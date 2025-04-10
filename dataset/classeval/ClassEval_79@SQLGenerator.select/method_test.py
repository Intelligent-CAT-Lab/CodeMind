def test(self):

        sql = SQLGenerator('table1')
        result = sql.select(['field1'], "field2 = value1, field3 = value2")
        return result