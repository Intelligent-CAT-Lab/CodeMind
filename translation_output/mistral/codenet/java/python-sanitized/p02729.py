import sys

n = int(input())
m = int(input())

nComb = n * (n-1) // 2
mComb = m * (m-1) // 2

print(nComb + mComb)