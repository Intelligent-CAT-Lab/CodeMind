text = "URW rNB"
occ = {}
for ch in text:
    name = {'a': 'b', 'b': 'c', 'c': 'd', 'd': 'e', 'e': 'f'}
    name = name.get(ch, ch)
    occ[name] = occ.get(name, 0) + 1
print([x for _, x in occ.items()])