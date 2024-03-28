N, A, B = map(int, input().split())
print(min(A, B), max(0, A + B - N))