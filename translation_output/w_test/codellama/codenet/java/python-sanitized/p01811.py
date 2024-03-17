import sys

class Task:
    def solve(self, inp, out):
        S = inp.readline().strip()
        while len(S) > 3:
            abc = False
            for i in range(len