import sys

class MyInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream

    def next_int(self):
        return int(self.input_stream.readline())

    def next_long(self):
        return int(self.input_stream.readline())

    def next_string(self):
        return self.input_stream.readline().strip()

class Solver:
    def calc(self, n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans

    def solve(self, test_number, in_obj, out_obj):