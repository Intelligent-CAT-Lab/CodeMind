import sys
import random

def rd():
        return sys.stdin.readline().rstrip()

def rdi():
        return [ int(x) for x in rd().split() ]

K, N = rdi()

if K == 1:
        print " ".join(["1"] * ((N+1)/2))
        sys.exit(0)

if K % 2 == 0:
        print K/2,
        for i in range(N-1):
                print K,
        print
        sys.exit(0)

t = [ K/2+1 ] * N
j = N-1
for i in range(N/2):
        if t[j] == 1:
                j -= 1
        else:
                t[j] -= 1
                for k in range(j+1, N):
                        t[k] = K
                j = N-1
        #print t
print " ".join([ str(x) for x in t[:j+1]])