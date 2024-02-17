from math import floor
A, B, N = map(int, "5 7 4".split())
print(floor(A*min(B-1, N)/B))