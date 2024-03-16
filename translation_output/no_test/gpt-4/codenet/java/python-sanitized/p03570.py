from sys import stdin, stdout

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
    
    def next(self):
        while not self.buffer:
            line = self.stream.readline().strip()
            if not line:
                raise RuntimeError('EOF')
            self.buffer = line.split()
        return self.buffer.pop(0)

class TaskD:
    def solve(self, testNumber, scanner, writer):
        s = scanner.next()
        d = [len(s)] * (1 << 26)
        d[0] = 0
        mask = 0
        ans = len(s)
        for i in range(len(s)):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = 0 if j < 0 else (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == len(s) - 1:
                    ans = min(ans, cur)
        writer.write(f"{ans}\n")

if __name__ == "__main__":
    scanner = FastScanner(stdin)
    writer = stdout
    solver = TaskD()
    solver.solve(1, scanner, writer)
    writer.flush()