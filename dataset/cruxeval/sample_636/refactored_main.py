d = { 3: 'A3', 1: 'A1', 2: 'A2' }
r = {}
while len(d) > 0:
    r = {**r, **d}
    del d[max(d.keys())]
print(r)