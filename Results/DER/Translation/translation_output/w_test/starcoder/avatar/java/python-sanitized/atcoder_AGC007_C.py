import math

def main():
    N, d, x = map(float, input().split())
    ans = 0
    while N > 0.5:
        ans += (d + x * (N - 0.5))
        d = (N +