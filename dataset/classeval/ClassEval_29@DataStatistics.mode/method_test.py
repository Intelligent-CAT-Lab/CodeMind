def test(self):

        ds = DataStatistics()
        res = ds.mode([2, 2, 3, 3, 4, 4, 4])
        return res