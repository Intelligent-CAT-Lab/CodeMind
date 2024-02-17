d = {'a': 1, 'b': 2, 'c': 3}
size = len(d)
v = [0] * size
if size == 0:
    print(v)
for i, e in enumerate(d.values()):
    v[i] = e
print(v)