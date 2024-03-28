import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream

    def close(self):
        self.stream.close()

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        return int(self.next_str())

    def next_str(self):
        return self.stream.readline().rstrip()

def solve(N, K):
    base = 1
    cnt = 0
    while base <= N:
        cnt += 1
        base *= K
    return cnt

def main():
    inp = FastScanner(sys.