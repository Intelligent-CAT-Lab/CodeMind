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
            if not line: return None
            self.queue += line.split(' ')
        return self.queue.pop(0)

    def has_next(self):
        while self.queue and not self.queue[0]: self.queue.pop(0)
        return bool(self.queue)

    def next(self):
        return self.read()

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.inp.readline().rstrip('\n')

fsc = FastScanner()
w, a, b = fsc.next_int(), fsc.next_int(), fsc.next_int()

if a <= b and b <= a + w:
    print(0)
elif a <= b + w and b + w <= a + w:
    print(0)
elif a + w <= b:
    print(b - a - w)
else:
    print(a - b - w)