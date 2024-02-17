import sys
from collections import deque
sys.setrecursionlimit(10**6)
k=int(eval(input()))
g=[[] for i in range(k)]
for i in range(k):
  g[i].append(((i+1)%k,1))
  if i:
    g[i].append((10*i%k,0))
q=deque([1])
res=[float('inf')]*k
res[1]=1
while q:
  v=q.popleft()
  if v==0:
    break
  for c,d in g[v]:
    if res[c]<=res[v]+d:
      continue
    res[c]=res[v]+d
    if d:
      q.append(c)
    else:
      q.appendleft(c)
print((res[0]))