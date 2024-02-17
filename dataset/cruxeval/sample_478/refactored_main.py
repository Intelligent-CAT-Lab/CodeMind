sb = 'meow meow'
d = {}
for s in sb:
    d[s] = d.get(s, 0) + 1
print(d)