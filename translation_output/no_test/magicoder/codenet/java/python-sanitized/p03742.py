import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        sign