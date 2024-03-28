import sys

class Kattio:
    def __init__(self, file):
        self.file = file
        self.buffer = bytearray(sys.stdin.buffer.read())
        self.offset = 0
        self.buflen = 0

    def has_more_tokens(self):
        return self.offset < self.buflen

    def get_int(self):
        return int(self.next_token())

    def get_double(self):
        return float(self.next_token())