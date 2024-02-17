from itertools import permutations
n = int(input())
b = permutations(range(1, n+1))
for ele in b:
  print(" ".join(map(str, ele)))
