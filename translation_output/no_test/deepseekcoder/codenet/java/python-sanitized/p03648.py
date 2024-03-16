import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.queue = []
        self.space = []
        self.inp = inp

    def read(self):
        if self.space:
            return self.space.pop()
        if not self.queue:
            line = self.inp.readline()
            self.queue = list(line.strip().split(" "))
        return self.queue.pop(0)

    def next(self):
        return self.read()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

sc = FastScanner()

K = sc.next_long()
A = K//50
B = K%50

a = [i + A for i in range(50)]

for i in range(49, 49-B, -1):
    a[i] += 1

print(50)
print(" ".join(map(str, a)))