def test(self):

        mc = MetricsCalculator()
        temp = mc.precision([1, 1, 0, 0], [1, 0, 1, 1])
        return temp