```python
import sys
from io import StringIO

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.input = stream
        
    def close(self):
        try:
            self.input.close()
        except IOError as e:
            print(e)

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        try:
            sign = 1
            b = self.input.read(1)
            while (b < '0' or '9' < b) and b != '-' and b != '+':
                b = self.input.read(1)
            if b == '-':
                sign = -1
                b = self.input.read(1)
            elif b == '+':
                b = self.input.read(1)
            ret = int(b)
            while True:
                b = self.input.read(1)
                if b < '0' or '9' < b:
                    return ret * sign
                ret *= 10
                ret += int(b)
        except IOError as e:
            print(e)
            return -1

    def next_double(self):
        try:
            sign = 1
            b = self.input.read(1)
            while (b < '0' or '9' < b) and b != '-' and b != '+':
                b = self.input.read(1)
            if b == '-':
                sign = -1
                b = self.input.read(1)
            elif b == '+':
                b = self.input.read(1)
            ret = int(b)
            while True:
                b = self.input.read(1)
                if b < '0' or '9' < b:
                    break
                ret *= 10
                ret += int(b)
            if b != '.':
                return sign * ret
            div = 1
            b = self.input.read(1)
            while '0' <= b and b <= '9':
                ret *= 10
                ret += int(b)
                div *= 10
                b = self.input.read(1)
            return sign * ret / div
        except IOError as e:
            print(e)
            return float('nan')

    def next_char(self):
        try:
            b = self.input.read(1)
            while b.isspace():
                b = self.input.read(1)
            return b
        except IOError as e:
            print(e)
            return 0

    def next_str(self):
        try:
            sb = []
            b = self.input.read(1)
            while b.isspace():
                b = self.input.read(1)
            while b and not b.isspace():
                sb.append(b)
                b = self.input.read(1)
            return ''.join(sb)
        except IOError as e:
            print(e)
            return ""

    def next_line(self):
        try:
            sb = []
            b = self.input.read(1)
            while b and b != '\n':
                sb.append(b)
                b = self.input.read(1)
            return ''.join(sb)
        except IOError as e:
            print(e)
            return ""

    def next_int_array(self, n):
        res = []
        for _ in range(n):
            res.append(self.next_int())
        return res

class p02766:
    def __init__(self):
        self.in_stream = FastScanner()
        self.out_stream = StringIO()
        self.MOD = int(1e9) + 7

    def ceil(self, a, b):
        return (a + b - 1) // b

    def gcd(self, a, b):
        return a if b == 0 else self.gcd(b, a % b)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def solve(self):
        N, K = self.in_stream.next_int(), self.in_stream.next_int()
        base, cnt = 1, 0
        while base <= N:
            cnt += 1
            base *= K
        print(cnt, file=self.out_stream)

    def main(self):
        self.solve()
        print(self.out_stream.getvalue())

if __name__ == "__main__":
    p = p02766()
    p.main()
```
```
