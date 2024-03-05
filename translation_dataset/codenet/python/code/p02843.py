N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)