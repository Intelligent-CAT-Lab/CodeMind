d = dict(e=1, d=2, c=3)
i = len(d) - 1
key = list(d.keys())[i]
d.pop(key, None)
print(key, d)