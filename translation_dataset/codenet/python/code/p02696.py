from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))