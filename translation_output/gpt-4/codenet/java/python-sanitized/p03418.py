import math
import sys
from collections import defaultdict

MOD = 1_000_000_007
dx4 = [0, 1, 0, -1]
dy4 = [1, 0, -1, 0]
dx8 = [0, 1, 1, 1, 0, -1, -1, -1]
dy8 = [1, 1, 0, -1, -1, -1, 0, 1]

def main():
    n, k = map(int, input().split())
    ans = 0
    for b in range(k + 1, n + 1):
        ans += (n // b) * (b - k) + max(0, (n % b) - k + 1) - (1 if k == 0 else 0)
    print(ans)

def gcd(a, b):
    # Largest divisor function
    return b if a % b == 0 else gcd(b, a % b)

def lcm(a, b):
    # Smallest multiple function
    return a // gcd(a, b) * b

def count_occurrences(seq):
    #