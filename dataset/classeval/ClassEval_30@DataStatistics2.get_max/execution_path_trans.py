
import sys
import trace
import os
import unittest
import numpy as np


class DataStatistics2:
    def __init__(self, data):
        self.data = np.array(data)

    def get_sum(self):
        return np.sum(self.data)

    def get_min(self):
        return np.min(self.data)

    def get_max(self):
        return np.max(self.data)

    def get_variance(self):
        return round(np.var(self.data), 2)

    def get_std_deviation(self):
        return round(np.std(self.data), 2)

    def get_correlation(self):
        return np.corrcoef(self.data, rowvar=False)
class Test(unittest.TestCase):
    def test(self):
            ds2 = DataStatistics2([-1, 4, 3, 2])
            res = ds2.get_max()
            return res
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_30@DataStatistics2.get_max/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
