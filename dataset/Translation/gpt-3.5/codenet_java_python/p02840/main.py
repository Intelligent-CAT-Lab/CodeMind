import sys
from collections import defaultdict
from itertools import groupby

def solve():
    T = 1
    for _ in range(T):
        solve_case()

def solve_case():
    n, x, d = map(int, input().split())
    
    if d == 0:
        if x == 0:
            print(1)
            return
        else:
            print(n + 1)
            return
    
    if x == 0:
        print(1 + n * (n - 1) // 2)
        return
    
    m = defaultdict(list)
    
    for take in range(n + 1):
        b = take * x
        s = take * (take - 1) // 2
        r = (n - take) * take + s
        c = b // d
        m[b % d].append([c + s, c + r])
    
    ans = 0
    
    for key, value in m.items():
        value.sort()
        ranges = merge_ranges(value)
        for start, end in ranges:
            ans += end - start + 1
            
    print(ans)

def merge_ranges(ranges):
    ranges.sort()
    merged = []
    
    for start, end in ranges:
        if not merged or start > merged[-1][1]:
            merged.append([start, end])
        else:
            merged[-1][1] = max(merged[-1][1], end)
    
    return merged

if __name__ == "__main__":
    solve()