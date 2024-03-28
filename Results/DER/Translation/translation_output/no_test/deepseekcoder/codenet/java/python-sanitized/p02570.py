import sys
from io import StringIO

class SegmentTree: # 1-based DS, OOP

    def __init__(self, in_):
        self.array = in_
        self.N = len(in_) - 1
        self.sTree = [0] * (self.N << 1) # no. of nodes = 2*N - 1, we add one to cross out index zero
        self.lazy = [0] * (self.N << 1)
        self.build(1, 1, self.N)

    def build(self, node, b