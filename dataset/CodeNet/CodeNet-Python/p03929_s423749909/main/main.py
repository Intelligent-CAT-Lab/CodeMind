#import string,itertools,fractions,heapq,re,array,bisect
#from math import *
#from collections import Counter
def rl(s): return range(len(s))

INF = 2147483647


import sys
stdin = sys.stdin

N, K = list(map(int, stdin.readline().strip().split()))


m = 100
grid = [list(range(start, start+7)) for start in range(1, m*7, 7)]

for_y = [0] * 11
for y in range(11):
    for x in range(5):
        here = sum(sum(grid[y+i][x:x+3]) for i in range(3))
        if here % 11 == K:
            for_y[y] += 1

#print for_y
N -= 2
if N <= 2:
    print(0)
else:
    rr = (N // 11) * sum(for_y)
    extra = N % 11
    if extra >= 1:
        rr += sum(for_y[:extra])

    print(rr)




