a, b, n = map(int, input().split())
score = abs(a - b)
for x in range(1, n + 1):
  for y in range(1, n + 1):
    if b * x % y == 0:
      new_a = b * x // y
      score = min(score, abs(a - new_a))
print(score)
