import math
import sys

def main():
    N = float(input())
    d = float(input())
    x = float(input())

    ans = 0

    while N > 0.5:
        adnum = (d + x * (N - 0.5))
        ans += adnum
        d = (N +