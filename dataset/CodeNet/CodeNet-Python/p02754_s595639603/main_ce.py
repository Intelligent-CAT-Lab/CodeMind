N,A,B = list(map(int, "8 3 4".split()))
groups = N // (A+B)
amari = N % (A+B)
if amari > A:
  print(groups*A + A)
else:
  print(groups*A + amari)
