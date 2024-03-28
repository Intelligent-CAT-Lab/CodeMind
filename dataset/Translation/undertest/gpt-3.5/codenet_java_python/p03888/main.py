import sys

class LightScanner:
    def __init__(self, inp):
        self.tokenizer = iter(inp.split())
    
    def string(self):
        return next(self.tokenizer)
    
    def doubles(self):
        return float(self.string())

class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out
        self.autoflush = False
        self.breaked = True
    
    def print(self, value):
        self.out.write(str(value))
        self.breaked = False
        return self
    
    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += 10 ** -n / 2
        self.print(str(int(x))).print('.')
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(chr(ord('0') + int(x)))
            x -= int(x)
        return self
    
    def ln(self):
        self.out.write('\n')
        self.breaked = True
        if self.autoflush:
            self.out.flush()
        return self
    
    def close(self):
        self.out.close()

def solve(r1, r2):
    return 1 / (1 / r1 + 1 / r2)

def main():
    inp = sys.stdin.read()
    scanner = LightScanner(inp)
    writer = LightWriter()
    r1, r2 = scanner.doubles(), scanner.doubles()
    writer.ans(solve(r1, r2), 10).ln()
    writer.close()

if __name__ == "__main__":
    main()