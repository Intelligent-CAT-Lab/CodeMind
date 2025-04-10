import os
import unittest
class AvgPartition:
    def __init__(self, lst, limit):
        self.lst = lst
        self.limit = limit

    def setNum(self):
        size = len(self.lst) // self.limit
        remainder = len(self.lst) % self.limit
        return size, remainder

        
    def get(self, index):
        size, remainder = self.setNum()
        start = index * size + min(index, remainder)
        end = start + size
        if index + 1 <= remainder:
            end += 1
        return self.lst[start:end]
class Test(unittest.TestCase):
    def test(self):
            a = AvgPartition([1, 2, 3, 4, 5], 2)
            return a.setNum()
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_6@AvgPartition.setNum/output.txt', 'w') as wr:
    wr.write(str(a))
        