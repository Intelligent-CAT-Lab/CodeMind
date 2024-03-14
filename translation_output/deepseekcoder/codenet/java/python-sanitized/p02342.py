import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.queue = collections.deque()
        self.sep = ' '
        self.inp = inp

    def has_next(self):
        while len(self.queue) == 0:
            line = self.inp.readline().strip()
            self.queue += line.split(self.sep)
        return len(self.queue) > 0

    def next(self):
        if not self.has_next():
            raise StopIteration
        return self.queue.popleft()

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.inp.readline().strip()


def partition(n, k):
    if