from sys import exit, setrecursionlimit, stderr
from functools import reduce
from itertools import *
from collections import defaultdict
from bisect import bisect

def read():
  return int(eval(input()))

def reads():
  return [int(x) for x in input().split()]

N, D1, D2 = reads()
NN = 2 * N

def deg(x):
  return next(i for i in count() if x >> i & 1 == 1)

p1 = deg(D1)
p2 = deg(D2)

def group(x, y, p):
  hp = p >> 1
  if p & 1 == 0:
    return (x >> hp & 1) ^ (y >> hp & 1)
  else:
    return x >> hp & 1

pts = [(x, y) for x in range(NN) for y in range(NN) if group(x, y, p1) == 0 and group(x, y, p2) == 0]
for x, y in pts[:N**2]:
  print((x, y))
