Here is the Python version of the Java code:

```python
import sys

class Scanner:
    def __init__(self, s):
        self.st = None
        self.br = open(s, 'r') if isinstance(s, str) else s

    def next(self):
        while self.st is None or not self.st.has_more_tokens():
            try:
                self.st = self.br.readline().strip().split()
            except:
                sys.exit()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLine(self):
        return self.br.readline().strip()

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextCharArray(self, n):
        return self.nextLine().strip().replace(' ', '')

    def nextStringArray(self, n):
        return [self.next() for _ in range(n)]

def main():
    inp = Scanner(sys.stdin)
    out = sys.stdout

    a = inp.nextInt()
    b = inp.nextInt()
    c = inp.nextInt()
    x = inp.nextInt()
    y = inp.nextInt()

    if a + b < 2 * c:
        out.write(str(x * a + y * b))
    else:
        min_ = min(x, y)
        max_ = max(x, y)
        res = 0
        res += 2 * c * min_
        if max_ == x:
            res += min(a, 2 * c) * (max_ - min_)
