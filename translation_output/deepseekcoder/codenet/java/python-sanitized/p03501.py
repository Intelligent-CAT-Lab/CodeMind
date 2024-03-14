import sys
import random
import math
from typing import List, Tuple

MOD = 998244353

def main():
    sc = FastScanner()
    N = sc.ni()
    A = sc.ni()
    B = sc.ni()
    print(min(A*N, B))

def dist(p1: Tuple[int, int], p2: Tuple[int, int]) -> int:
    return abs(p2[0]-p1[0]) + abs(p2[1]-p1[1])

def gcd(a: int, b: int) -> int:
    if a < b: return gcd(b, a)
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def power(x: int, y: int, m: int) -> int:
    if y < 0: return 0
    ans = 1
    x %= m
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % m
        y //= 2
        x = (x * x) % m
    return ans

def shuffle(array: List[int]) -> List[int]:
    random.shuffle(array)
    return array

def sort(array: List[List[int]]) -> List[List[int]]:
    array.sort(key=lambda x: (x[0], x[1]))
    return array

class FastScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self) -> str:
        return self.br.readline().rstrip()

    def ni(self) -> int:
        return int(self.next())

    def nl(self) -> int:
        return long(self.next())

    def nd(self) -> float:
        return float(self.next())

    def nextLine(self) -> str:
        return self.next()

if