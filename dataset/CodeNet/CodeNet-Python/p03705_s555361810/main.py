N, A, B = map(int, input().split())
if N == 1:
  if A == B:
    print(1)
  else:
    print(0)
else:
  if A > B:
    print(0)
  elif A == B or N == 2:
    print(1)
  else:
    print((B-A) * (N-2) + 1)