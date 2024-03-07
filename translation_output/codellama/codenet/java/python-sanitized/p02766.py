import sys
import math

class FastScanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        return int(self.next_str())

    def next_double(self):
        return float(self.next_str())

    def next_str(self):
        return self.input_stream.readline().strip()

    def next_char(self):
        return self.input_stream.read(1)

    def next_line(self):
        return self.input_stream.readline()

    def next_int_array(self, n):
        return [self.