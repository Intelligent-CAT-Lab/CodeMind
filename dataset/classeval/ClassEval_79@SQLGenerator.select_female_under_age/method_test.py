def test(self):

        sql = SQLGenerator('table1')
        result = sql.select_female_under_age(40)
        return result