from math import floor
A, B, N = list(map(int, input().split()))
print((floor(A*min(B-1, N)/B)))