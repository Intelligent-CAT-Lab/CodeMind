def test(self):

        calc = CombinationCalculator(["A", "B", "C", "D"])
        result = []
        calc._select(0, [None] * 0, 0, result)
        return result