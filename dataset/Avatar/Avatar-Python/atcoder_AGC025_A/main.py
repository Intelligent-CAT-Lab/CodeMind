from collections import defaultdict , deque
import sys,heapq,bisect,math,itertools,string,queue,datetime
sys.setrecursionlimit(10**8)
INF = float('inf')
mod = 10 ** 9 + 7
def inpl() : return list(map(int ,input().split()))
def inpls() : return list(input().split())
N = int(input())
def dsum(x) :
    return sum(map(int, list(str(x))))
ans = INF
for a in range(1, N):
    b = N - a
    ans = min(ans, dsum(a) + dsum(b))
print(ans)

