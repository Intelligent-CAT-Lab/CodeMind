def test(self):

        ac = ArrangementCalculator([1])
        res = ac.select_all()
        expected = [[1]]
        return res,expected