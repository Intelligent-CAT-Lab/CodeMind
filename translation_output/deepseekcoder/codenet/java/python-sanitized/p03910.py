import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.queue = []
        self.space = []
        self.inp = inp

    def read(self):
        if self.space: return self.space.pop()
        if not self.queue:
            try:
                line = self.inp.readline()
            except:
                return None
            if not line:
                return None
            self.queue += line.split(' ')
        return self.queue.pop(0)

    def has_next(self):
        while self.queue and not self.queue[0]:
            self.queue.pop(0)
        return bool(self.queue)

    def next(self):
        return self.read()

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.inp.readline().rstrip('\n')

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


def main():
    sc = FastScanner()
    out = sys.stdout
    N = sc.next_int()
    table = [0]*(N+1)
    M = 0
    for i in range(1, N+1):
        table[i] = table[i-1] + i
        if table[i]>=N:
            M = i
            break
    s = set(range(1, M+1))
    s.remove(table[M]-N)
    for a in s:
        print(a, file=out)


if __name__ == "__main__":
    main()