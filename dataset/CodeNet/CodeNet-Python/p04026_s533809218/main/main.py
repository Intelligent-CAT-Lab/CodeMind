import sys, bisect, math, itertools, string, queue, copy
# import numpy as np
# import scipy
from collections import Counter,defaultdict,deque
from itertools import permutations, combinations
from heapq import heappop, heappush
# input = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
def inp(): return int(eval(input())) # n=1
def inpm(): return list(map(int,input().split())) # x=1,y=2
def inpl(): return list(map(int, input().split())) # a=[1,2,3,4,5,...,n]
def inpls(): return list(input().split())  # a=['1','2','3',...,'n']
def inplm(n): return list(int(eval(input())) for _ in range(n)) # x=[] 複数行
def inplL(n): return [list(eval(input())) for _ in range(n)]
def inplT(n): return [tuple(eval(input())) for _ in range(n)]
def inpll(n): return [list(map(int, input().split())) for _ in range(n)] # [[2,2,2,2],[1,1,1,1],[3,3,3,3]] 
def inplls(n): return sorted([list(map(int, input().split())) for _ in range(n)]) # [[1,1,1,1],[2,2,2,2],[3,3,3,3]] 
def graph():
    n=inp()
    g=[[] for _ in range(n)]
    for i in range(n):
        a = inp()
        a -= 1
        g[i].append(a)
        g[a].append(i)
    return n,g

def main():
    s = list(eval(input()))
    if len(s)==2 and (s[0]==s[1]):
        print((1,2))
        return
    elif len(s)==2:
        print((-1,-1))
        return
    dic = defaultdict(int)
    dic[s[0]] += 1
    dic[s[1]] += 1
    dic[s[2]] += 1
    for e in dic:
        if dic[e] >= 2:
            print((1,3))
            return
    for i in range(len(s)-3):
        dic[s[i]] -= 1
        dic[s[i+3]] += 1
        for e in dic:
            if dic[e] >= 2:
                print((i+2,i+4))
                return
    print((-1,-1))            

if __name__ == "__main__":
    main()