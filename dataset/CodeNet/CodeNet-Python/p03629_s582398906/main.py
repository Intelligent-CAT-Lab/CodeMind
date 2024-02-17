import sys
input = sys.stdin.readline
from collections import *
from bisect import *

A = input()[:-1]
K = [0]*(len(A)) #K[i]: A[i+1:]の部分列に含まれない最小の文字列の長さ
s = set()
cnt = 1

for i in range(len(A)-1, -1, -1):
    K[i] = cnt
    s.add(A[i])
    
    if len(s)==26:
        cnt += 1
        s = set()

d = defaultdict(list)

for i in range(len(A)):
    d[A[i]].append(i)

ans = []
now = -1

for i in range(cnt):
    for alpha in 'abcdefghijklmnopqrstuvwxyz':
        idx = bisect_right(d[alpha], now)
        
        if idx==len(d[alpha]):
            ans.append(alpha)
            break
        
        nex = d[alpha][idx]
        
        if K[nex]==cnt-i-1:
            now = nex
            ans.append(alpha)
            break

print(''.join(ans))