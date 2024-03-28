import sys
import math
from typing import Tuple

# Global constant
MOD = 10**9 + 7

def dfs(d: int, S1: int, S2: int, w: int, h: int) -> int:
    if w <= 0 or h <= 0:
        return float('inf')
    if d == 1:
        return max(S2, w * h) - min(S1, w * h)
    
    ans = float('inf')
    
    for i in (-1, 0, 1):
        dw = w // d + i
        dh = h // d + i
        if dw > 0:
            ans = min(ans, dfs(d - 1, min(S1, dw * h), max(S2, dw * h), w - dw, h))
        if dh > 0:
            ans = min(ans, dfs(d - 1, min(S1, w * dh), max(S2, w * dh), w, h - dh))
    
    return ans

def main():
    h, w = map(int, input().split())
    print(dfs(3, float('-inf'), float('inf'), w, h))

if __name__ == "__main__":
    main()