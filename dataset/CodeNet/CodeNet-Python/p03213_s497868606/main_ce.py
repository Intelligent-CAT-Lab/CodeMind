n = int("9")
if n == 1:
    print(0)
    exit()
import math
def div(m):
  d = {}
  temp = int(math.sqrt(m))+1
  for i in range(2, temp):
    while m%i== 0:
      m //= i
      if i in d:
        d[i] += 1
      else:
        d[i] = 1
  if d == {}:
    d[m] = 1
  else:
    if m in d:
      d[m] += 1
    elif m != 1:
      d[m] =1
  return d
D = {}
for i in range(2, n+1):
    d = div(i)
    for k, v in d.items():
        if k in D:
            D[k] += v
        else:
            D[k] = v
#print(D)
A = set()
B = set()
P = set()
Q = set()
R = set()
for k, v in D.items():
    if v >= 74:
        R.add(k)
    if v >= 24:
        P.add(k)
    if v >= 14:
        Q.add(k)
    if v >= 4:
        B.add(k)
    if v >= 2:
        A.add(k)
ans = 0
b = len(B)
for a in A:
    if a not in B:
        ans += b*(b-1)//2
    else:
        ans += (b-1)*(b-2)//2
p = len(P)
for a in A:
    if  a not in P:
        ans += p
    else:
        ans += p-1
q = len(Q)
for b in B:
    if b not in Q:
        ans += q
    else:
        ans += q-1
ans += len(R)
print(ans)