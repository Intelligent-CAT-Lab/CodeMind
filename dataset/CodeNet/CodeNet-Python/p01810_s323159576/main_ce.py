N, k = [int(i) for i in "4 2".split()]
ans = 0
for i in range(N - 1):
  ans = (ans * k + k - 1) // (k - 1)
print(ans)
