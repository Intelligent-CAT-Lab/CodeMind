def test(self):

        sql = SQLGenerator('table1')
        result = sql.select_by_age_range(50, 60)
        return result