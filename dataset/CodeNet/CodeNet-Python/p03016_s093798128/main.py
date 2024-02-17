import math
import numpy as np
from decimal import *
L,A,B,M=map(int, input().split())

def matpow(X,n,mod):
  E = np.eye(N=X.shape[0],dtype=int)
  Y = X%mod
  if n == 1:
    return Y
  else:
    return np.dot(matpow(np.dot(Y,Y)%mod,n//2,mod), (Y if n % 2 else E))%mod
  
a = 0
for d in range(1,19):
  left = math.ceil(Decimal(10**(d-1)-A)/Decimal(B))
  right = math.ceil(Decimal(10**d-A)/Decimal(B))-1
  if right < 0:
    continue
  if left > L-1:
    break
  if left > right:
    continue
  if left < 0:
    left = 0
  if right > L-1:
    right = L-1
  mat = np.matrix([[10**d,0,0],[1,1,0],[0,1,1]])
  result = np.dot(np.array([a,A+B*left,B])%M, matpow(mat,right-left+1,M))
  a = result[0,0]%M
  
print(a)