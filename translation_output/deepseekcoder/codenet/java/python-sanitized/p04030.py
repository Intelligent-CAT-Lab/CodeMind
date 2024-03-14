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
            self.queue = list(line)[::-1]
        return self.queue.pop()

    def has_next(self):
        while self.queue and not self.queue[-1].isspace():
            self.space.append(self.queue.pop())
        return bool(self.queue)

    def next(self):
        ans = []
        while self.queue and self.queue[-1].isspace():
            self.queue.pop()
        while self.queue and