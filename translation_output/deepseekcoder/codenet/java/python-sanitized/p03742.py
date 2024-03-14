import sys

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.input = input

    def next_int(self):
        return int(self.next_long())