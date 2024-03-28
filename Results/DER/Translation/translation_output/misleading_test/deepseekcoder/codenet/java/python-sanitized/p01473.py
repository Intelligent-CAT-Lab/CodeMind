from collections import Counter
from math import factorial

def solve(s):
    count = Counter(s)
    allow_odd = len(s) % 2 == 0
    odd_count = sum(v % 2 for v in count.values())
    if odd_count > allow_odd:
        return 0
    if odd_count % 2 == 1:
        count[next(k for k, v in count.items() if v % 2 == 1)] -= 1
    count = {k: v // 2 for k, v in count.items()}
    valid = sum(count.values())
    sum_ = factorial(valid)
    for v in count.values():
        sum_ //= factorial(v)
    return sum_

print(solve(input()))