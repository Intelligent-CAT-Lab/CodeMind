import sys
import math

MOD = 998244353

class FastScanner:
    def __init__(self):
        self.input_lines = sys.stdin.readlines()
        self.idx = 0
        self.tokens = []

    def next_token(self):
        while not self.tokens or len(self.tokens) <= self.idx:
            if self.idx < len(self.input_lines):
                self.tokens = self.input_lines[self.idx].strip().split()
            self.idx += 1
        return self.tokens[self.idx-1]

    def ni(self):
        return int(self.next_token())

def dist(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def power(x, y, m):
    if y < 0:
        return 0
    ans = 1
    x %= m
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % m
        y //= 2
        x = (x * x) % m
    return ans

if __name__ == "__main__":
    sc = FastScanner()

    N = sc.ni()
    A = sc.ni()
    B = sc.ni()
    
    print(min(A*N, B))