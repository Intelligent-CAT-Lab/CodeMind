import math

def solve(inp, out, ms):
    a = inp.next_double()
    b = inp.next_double()
    out.write(str(4.0/3.0*math.pi*b*b*b) + "\n")

class FastScanner:
    def __init__(self, inp):
        self.inp = inp
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.inp.readinto(self.buffer)
            except Exception as e:
                print(e)
            if self.length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte() == True:
            return self.buffer[self.p]
        return -1

    def is_printable(self, n):
        return 33 <= n and n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No more elements to read")
        sb = ""
        t = self.read_byte()
        while self.is_printable(t):
            sb += chr(t)
            t = self.read_byte()
        return sb

    def next_int(self):
        return int(self.next_double())

    def next_double(self):
        if not self.has_next():
            raise ValueError("No more elements to read")
        minus = False
        t = self.read_byte()
        if t == ord('