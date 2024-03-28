import sys

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = []

    def next(self):
        if not self.buffer:
            self.buffer = self.input_stream.readline().split()
        return self.buffer.pop(0