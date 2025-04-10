def test(self):

        sql = SQLGenerator('table1')
        result = sql.delete("field1 = value1 AND field2 = value2 AND field3 = value3 AND field4 = value4")
        return result