def test(self):

        mc = MetricsCalculator()
        temp = mc.f1_score([1, 1, 0, 0], [1, 0, 0, 1])
        return temp