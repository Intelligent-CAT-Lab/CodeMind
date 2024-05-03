Here is the Python version of the Java code:

```python
import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.buffer = []

    def next_int(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == '-':
            sign = -1
            read = self.inp.read()

        while read > 0x20:
            num = num * 10 + sign * (read - 0x30)
            read = self.inp.read()

        return num

    def fill(self, a):
        for i in range(len(a)):
            a[i] = self.next_int()

    def fill(self, a, b):
        if len(a) != len(b):
            raise ValueError("Arrays must be of the same length")

        for i in range(len(a)):
            a[i] = self.next_int()
            b[i] = self.next_int()

    def next_long(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == '-':
            sign = -1
            read = self.inp.read()

        while read > 0x20:
            num = num * 10 + sign * (read - 0x30)
            read = self.inp.read()

        return num

    def fill(self, a):
        for i in range(len(a)):
            a[i] = self.next_long()

    def fill(self, a, b):
        if len(a) != len(b):
            raise ValueError("Arrays must be of the same length")

        for i in range(len(a)):
            a[i] = self.next_long()
            b[i] = self.next_long()

    def next_long(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.next_long()

        return array

    def
