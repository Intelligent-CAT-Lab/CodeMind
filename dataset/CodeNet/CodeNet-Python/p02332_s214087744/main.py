from functools import lru_cache
import sys
mod=1000000007

n,k=[int(i) for i in input().split(" ")]

facts=[1 for i in range(k+1)]

for i in range(1,k+1):
    facts[i]=i*facts[i-1]



if n>k:
    print(0)
    sys.exit()

print((facts[k]//facts[k-n])%mod)

