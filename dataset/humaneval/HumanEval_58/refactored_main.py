l1 = [1, 4, 3, 34, 653, 2, 5]
l2 = [5, 7, 1, 5, 9, 653, 121]
ret = set()
for e1 in l1:
    for e2 in l2:
        if e1 == e2:
            ret.add(e1)
print(sorted(list(ret)))