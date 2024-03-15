import math
import sys

class P01741:
    def run(self, in_stream, out_stream):
        d = float(in_stream.readline())
        if d < 1:
            out_stream.write(str(d * math.sqrt(2)) + '\n')
        elif d < math.sqrt(2):
            out_stream.write("2\n")
        elif d < 2:
            out_stream.write(str(d * math.sqrt(2)) + '\n')
        elif d < math.sqrt(2) *