import sys

class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, value):
        try:
            self.out.write(str(value))
            self.breaked = False
        except Exception as ex:
            raise ex
        return self

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += 10**(-n) / 2
        self.print(int(x))
        self.print('.')
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(int(x))
            x -= int(x)
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except Exception as ex:
                raise ex
        return self

    def close(self):
        try:
            self.out.close()
        except Exception as ex:
            raise ex

class LightScanner:
    def __init__(self, input_stream=sys.stdin):
        self.reader = input_stream

    def string(self):
        return next(self.reader).strip()

    def doubles(self):
        return float(self.string())

class AEquivalentResistance:
    def solve(self, in_data):
        r1, r2 = in_data
        return 1 / (1/r1 + 1/r2)

# Test input reading
input_data = list(map(float, input().split()))

in_stream = [str(x) for x in input_data]
out_stream = sys.stdout

in_light = LightScanner(in_stream)
out_light = LightWriter(out_stream)

solver = AEquivalentResistance()
result = solver.solve(input_data)
out_light.ans(result, 10).ln()