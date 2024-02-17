from itertools import permutations
n = int("2")
b = permutations(range(1, n+1))
for ele in b:
  print(" ".join(map(str, ele)))
