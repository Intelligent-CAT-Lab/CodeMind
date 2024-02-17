import sys
input = sys.stdin.readline
N, A, B, C, D = map(int, "5 1 5 2 4".split())
for i in range(N - 1):
  l = C * i + A - D * (N - i - 1)
  r = D * i + A - C * (N - i - 1) + 1
  if B in range(l, r):
    print("YES")
    break
else: print("NO")