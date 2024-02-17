dct = {'a': 1, 'b': 2, 'c': 3}
lst = []
for key in sorted(dct):
    lst.append((key, dct[key]))
print(lst)