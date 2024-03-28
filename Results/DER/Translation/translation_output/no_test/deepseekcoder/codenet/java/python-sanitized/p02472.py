import sys
import io
import string
import math
from functools import *
from collections import *


class LightWriter:
    def __init__(self, out):
        self.out = out
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def println(self, s):
        self.print(s)
        self.out.write("\n")
        self.breaked = True


class LightScanner:
    def __init__(self, inp):
        self.reader = io.BufferedReader(io.InputStreamReader(inp))

    def next(self):
        input_line = self.reader.readLine()
        if input_line:
            return input_line
        else:
            raise EOFError()


class NTL_2_A:
    def solve(self, testNumber, inp, out):
        a, b = map(int, inp.next().split())
        out.println(str(a + b))


def main():
    inp = LightScanner(sys.stdin.buffer)
    out = LightWriter(sys.stdout)
    NTL_2_A().solve(1, inp, out)
    out.out.flush()


if __name__ == "__main__":
    main()