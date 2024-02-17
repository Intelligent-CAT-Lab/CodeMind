A, B = list(map(int, input().split()))
f = False
ans = 0
n = A * 100 // 8
m = (A + 1) * 100 // 8
for i in range(n, m + 1):
  if i * 8 // 100 == A and i // 10 == B:
    f = True
    ans = i
    break
print((ans if f else -1))
