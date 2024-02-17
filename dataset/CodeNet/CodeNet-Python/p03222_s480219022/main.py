from sys import exit, setrecursionlimit, stderr
from functools import reduce
from itertools import *
from collections import defaultdict, Counter
from bisect import bisect
import functools

def read():
  return int(input())

def reads():
  return [int(x) for x in input().split()]

H, W, K = reads()
P = 10**9 + 7

M = W + 100
fib = [0] * M
fib[0] = fib[1] = 1
for i in range(M-2):
  fib[i+2] = (fib[i] + fib[i+1]) % P

@functools.lru_cache(100000)
def solve(h, k):
  if h == 0:
    return 1 if k == 1 else 0
  if k == 1:
    return (solve(h-1, 1) * fib[W-1] + solve(h-1, 2) * fib[W-2]) % P
  elif k == W:
    return (solve(h-1, W) * fib[W-1] + solve(h-1, W-1) * fib[W-2]) % P
  else:
    return (solve(h-1, k) * fib[k-1] * fib[W-k]
      + solve(h-1, k-1) * fib[k-2] * fib[W-k]
      + solve(h-1, k+1) * fib[k-1] * fib[W-k-1]) % P

if W == 1:
  print(1); exit()
print(solve(H, K))

