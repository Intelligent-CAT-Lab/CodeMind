class main:
	from itertools import permutations
	n = int(eval(input()))
	b = permutations(list(range(1, n+1)))
	for ele in b:
	  print((" ".join(map(str, ele))))
