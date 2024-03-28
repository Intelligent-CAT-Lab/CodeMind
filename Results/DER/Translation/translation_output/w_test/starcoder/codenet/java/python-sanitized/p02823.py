import sys

class In:
    def __init__(self):
        self.lines = sys.stdin.readlines()
        self.num_lines = len(self.lines)
        self.index = 0

    def next(self):
        self.index += 1
        return self.lines[self.index - 1].strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextFloat(self):
        return float(self.next())

    def nextDouble(self):
        return float(self.next())

    def hasNext(self):
        return self.index < self.num_lines

class Out:
    def __init__(self):
        self.buffer = []

    def println(self, *objects):
        self.buffer.append(str(objects))

    def flush(self):
        print(*self.buffer, sep='\n')

class p02823:
    def __init__(self):
        self.in_ = In()
        self.out_ = Out()
        self.mod = 1000000007
        self.inf = 0xfffffffffffffff

    def solve(self):
        n = self.in_.nextLong()
        a = self.in_.nextLong()
        b = self.in_.nextLong()
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            self.out_.println(min(ans1, ans2))
        else:
            self.out_.println((b - a) // 2)

    def main(self):
        self.solve()
        self.out_.flush()

if __name__ == '__main__':
    p02823().main()