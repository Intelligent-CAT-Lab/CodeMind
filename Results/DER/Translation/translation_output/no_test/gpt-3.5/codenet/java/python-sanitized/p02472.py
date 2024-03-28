import sys
import io
import os
import atexit
import math
import functools
from io import BytesIO, IOBase
from sys import stdin, stdout
from bisect import bisect_right
from collections import Counter, defaultdict, deque
from math import gcd, inf, log2, log10, pi
from heapq import heappop, heappush, heapify
from functools import cmp_to_key


class Input:
    def __init__(self, input=stdin.buffer.read()):
        self._input = input

    def readline(self):
        return self._input.pop(0)

    def read(self):
        return self.readline().decode()

    def read_int(self):
        return int(self.read())

    def read_int_list(self):
        return list(map(int, self.read().split()))

    def read_str(self):
        return self.read().strip()


class Output:
    def __init__(self):
        self._output = []

    def write(self, value):
        self._output.append(value)

    def writeln(self, value):
        self.write(str(value) + '\n')

    def flush(self):
        print(''.join(self._output))


def main():
    input_stream = Input()
    output_stream = Output()
    solver = NTL_2_A()
    solver.solve(1, input_stream, output_stream)
    output_stream.flush()


class NTL_2_A:
    def solve(self, test_number, inp, out):
        a = inp.read_int()
        b = inp.read_int()
        out.writeln(a + b)


if __name__ == "__main__":
    main()