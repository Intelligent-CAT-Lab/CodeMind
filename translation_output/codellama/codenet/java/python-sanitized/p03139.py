import math

N = int(input())
A = int(input())
B = int(input())
print(math.min(A, B), math.max(0, A + B - N))