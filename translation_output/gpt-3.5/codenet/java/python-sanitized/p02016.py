import sys
from collections import defaultdict
from math import sqrt

class p02016:

    @staticmethod
    def solve(in_stream):
        line = in_stream.readline().strip()
        out_stream = sys.stdout
        out_stream.write("square1001\n" if line == "ani" else "e869120\n")


if __name__ == "__main__":
    p02016.solve(sys.stdin)