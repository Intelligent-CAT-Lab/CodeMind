import sys

class Solution:
    def __init__(self):
        self.hash = {}
        self.maxLen = 0
        self.isAll8 = lambda x: x == 8 or x == 0 and x % 10 == 8

    def func(self, n):
        if n in self.hash:
            return self.hash[n]

        same = False
        now = n
        res = -1
        for dlen in range(self.maxLen, 0, -1):
            for i in range(1 << dlen):
                d = 0
                ten = 1
                for j in range(dlen):
                    if (i & (1