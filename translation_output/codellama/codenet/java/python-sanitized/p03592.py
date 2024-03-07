import sys

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def __str__(self):
        return f"{{{self.key}, {self.value}}}"

    def __lt__(self, other):
        return self.value / self.key < other.value / other.key

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = ""

    def next_int(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == "-":
            sign = -1
            read = self.input_stream.read()

        while read > 0x20:
            num = num * 10 + sign * (read - 0x30)
            read = self.input_stream.read()

        return num

    def fill(self, a):
        for i in range(len(a)):
            a[i] = self.next_int()

    def fill(self, a, b):
        if len(a) != len(b):
            raise ValueError("a and b must have the same length")

        for i in range(len(a)):
            a[i] = self.next_int()
            b[i] = self.next_int()

    def next_long(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == "-":
            sign = -1
            read = self.input_stream.read()

        while read > 0x20:
            num = num * 10 + sign * (read - 0x30)
            read = self.input_stream.read()

        return num

    def fill(self, a):
        for i in range(len(a)):
            a[i] = self.next_long()

    def fill(self, a, b):
        if len(a) != len(b):
            raise Value