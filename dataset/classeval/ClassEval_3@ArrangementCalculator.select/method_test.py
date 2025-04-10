def test(self):

        ac = ArrangementCalculator([1, 2])
        res = ac.select()
        expected = [[1, 2], [2, 1]]
        return res,expected