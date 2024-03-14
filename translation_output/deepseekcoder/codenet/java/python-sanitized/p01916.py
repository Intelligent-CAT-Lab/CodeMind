import sys
import io
import collections

class p01916:
    def __init__(self):
        self.s = None
        self.a = None
        self.b = None
        self.buffer = io.BufferedReader(io.InputStreamReader(sys.stdin))

    def solve(self):
        self.s = list(self.next_string())

        self.a = [0]*26
        self.b = [0]*1111

        for ch in self.s:
            self.a[ord(ch)-ord('a')] += 1

        for i in range(26):
            self.b[self.a[i]] += 1

        for i in range(1000, -1, -2):
            if self.b[i] > 0:
                self.b[i] -= 1
                break

        m = 0

        for i in range(1, 1001, 2):
            m += self.b[i]

        print(m//2 + m%2)

    def next_string(self):
        return self.buffer.readline().strip()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

if __name__ == "__main__":
    p01916().solve()