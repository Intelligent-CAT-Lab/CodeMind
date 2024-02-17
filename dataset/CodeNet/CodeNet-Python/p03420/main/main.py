import sys
import random

def rd():
        return sys.stdin.readline().rstrip()

def rdi():
        return [ int(x) for x in rd().split() ]

N, K = rdi()

#N, K = 5, 2
#N, K = 10, 0
#N, K = 31415, 9265

s = 0
for b in range(K+1, N+1):
        an = 0
        j = N / b
        an = j * (b - K)
        #print b, an
        if N % b > 0:
                x1 = j * b + K
                if K == 0:
                        x1 += 1
                x2 = min(N, (j+1) * b - 1)
                #print b, x1, x2
                if x2 >= x1:
                        an += (x2 - x1 + 1)
        s += an
        #print b, an
print(s)
