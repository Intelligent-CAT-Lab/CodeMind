import os
import unittest
from collections import Counter


class DataStatistics:
    def mean(self, data):
        return round(sum(data) / len(data), 2)

    def median(self, data):
        sorted_data = sorted(data)
        n = len(sorted_data)
        if n % 2 == 0:
            middle = n // 2
            return round((sorted_data[middle - 1] + sorted_data[middle]) / 2, 2)
        else:
            middle = n // 2
            return sorted_data[middle]

    def mode(self, data):
        counter = Counter(data)
        mode_count = max(counter.values())
        mode = [x for x, count in counter.items() if count == mode_count]
        return mode
class Test(unittest.TestCase):
    def test(self):
            ds = DataStatistics()
            res = ds.mode([2, 2, 3, 3, 4, 4, 4])
            return res
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_29@DataStatistics.mode/output.txt', 'w') as wr:
    wr.write(str(a))
        