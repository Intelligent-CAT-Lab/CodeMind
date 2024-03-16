import sys
import io
import time
import re
import math

sys.stdin = io.StringIO(INPUT)
sys.stdout = io.StringIO()

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    print(answer)

def main():
    S = time.time()
    solve()
    G = time.time()
    print(G-S, "ms")

class UnionFind:
    def __init__(self, n):
        self.count = n
        self.parent = list(range(n))
        self.rank = [0] * n

    def find(self, p):
        while p != self.parent[p]:
            self.parent[p] = self.parent[