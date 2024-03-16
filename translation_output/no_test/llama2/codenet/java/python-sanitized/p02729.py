import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

nComb = n * (n-1) / 2
mComb = m * (m-1) / 2

print(nComb + mComb)