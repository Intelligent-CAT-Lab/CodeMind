l = [1,2,3]
l = list(l)
l[::3] = sorted(l[::3])
print(tuple(l))