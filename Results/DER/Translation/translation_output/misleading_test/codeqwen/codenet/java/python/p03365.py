Here is the Python equivalent of the Java code:

```python
import sys

class MyScan:
    def __init__(self, inp):
        self.inp = inp
        self.lenbuf = 0
        self.ptrbuf = 0

    def read_byte(self):
        if self.lenbuf == -1:
            raise ValueError("Input stream is closed")
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.inp.readinto(self.inbuf)
            except IOError:
                raise ValueError("Input stream is closed")
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def next_int(self):
        num = 0
        b = self.read_byte()
        while b != -1 and not (b >= ord('0') and b <= ord('9')):
            b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        else:
            minus = False

        while True:
            if b >= ord('0') and b <= ord('9'):
                num = num * 10 + (b - ord('0'))
            else:
                return -num if minus else num
            b = self.read_byte()

class Util:
    M07 = 1000000007
    _m = M07
    fact = None
    inv = None
    ifact = None

    @staticmethod
    def l():
        Util.fact = [1] * 1000001
        Util.inv = [1] * 1000001
        Util.ifact = [1] * 1000001
        for s in range(2):
            Util.fact[s] = 1
            Util.ifact[s] = 1
            Util.inv[s] = 1
        Util.inv[0] = 0
        for i in range(2, len(Util.inv)):
            Util.inv[i] = (
