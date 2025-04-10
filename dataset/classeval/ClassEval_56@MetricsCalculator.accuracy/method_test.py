def test(self):

        mc = MetricsCalculator()
        temp = mc.accuracy([1, 1, 0, 1], [1, 0, 0, 1])
        return temp