import io
import sys
import math
from functools import reduce

class P02570:
    a = []
    memo = []
    cum = []

    @staticmethod
    def gcd(a, b):
        while a != 0:
            a, b = b % a, a
        return b

    @staticmethod
    def countD(x):
        c = 0
        while x != 0:
            c += x % 10
            x //= 10
        return c

    @staticmethod
    def intersect(a, b):
        res = []
        if b:
            hm = set(a)
            res = [x for x in b if x in hm]
        return res
    
    #