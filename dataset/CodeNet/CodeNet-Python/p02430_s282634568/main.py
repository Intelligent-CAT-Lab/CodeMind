from itertools import combinations
n, k = map(int, input(). split())
l = [i for i in range(n)]
p = []
for i in combinations(l, k):
    num = 0
    for j in i:
        num |= 1 << j
    p.append((num, i))
    
p.sort()
for i, j in p:
    print("{}: ".format(i), end="")
    print(*j)
