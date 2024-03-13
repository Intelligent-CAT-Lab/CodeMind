import sys
import io
import math
import string
import itertools
import collections
import re
import os
import sys
import bisect
import heapq
import random
import time
import queue
import functools
import copy

class LightScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = LightTokenizer(self.inp.readline())
        return self.tokenizer.nextToken()

    def bigints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()

    def ln(self):
        self.print(os.linesep)
        self.breaked = True

    def close(self):
        self.out.close()

class NTL_2_A:
    def solve(self, testNumber, inp, out):
        out.ansln(str(inp.bigints() + inp.bigints()))

def main():
    inp = sys.stdin
    out = sys.stdout
    solver = NTL_2_A()
    solver.solve(1, LightScanner(inp), LightWriter(out))
    out.close()

if __name__ == "__main__":
    main()