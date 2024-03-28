import sys

class Solver:
    def calc(self, n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *=