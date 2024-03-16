import sys
import io

class FastScanner:
    def __init__(self):
        self.stdin = sys.stdin
        self.buffer = self.stdin.buffer
        self.newlines = [10, 13]

    def next(self):
        return self.stdin.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_float(self):
        return float(self.next())

def main():
    sc = FastScanner()
    N = sc.next_int()
    table = [0] * (N + 1)
    table[0] = 0
    M = 0

    for i in range(1, N + 1):
        table[i] = table[i - 1] + i
        if table[i] >= N:
            M = i
            break

    s = set(range(1, M + 1))
    s.remove(table[M] - N)

    for a in sorted(s):
        print(a)

if __name__ == "__main__":
    main()