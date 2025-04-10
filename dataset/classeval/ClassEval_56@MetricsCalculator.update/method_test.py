def test(self):

        mc = MetricsCalculator()
        mc.update([1, 1, 0, 0], [1, 1, 0, 1])
        return 