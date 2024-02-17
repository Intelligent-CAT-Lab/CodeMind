#! /usr/bin/env python3
a, b, x = map(int, "3 1 5".split())
MOD = int(1e9+7)
if x < a:
    res = x % MOD
else:
    k = (x-b) // (a-b)
    res = (x + b*k)
    res %= MOD
print(res)
