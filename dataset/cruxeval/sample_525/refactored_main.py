c = {'TEXT': 7, 'CODE': 3}
st = 7
ed = 3
d = {}
a, b = 0, 0
for x, y in c.items():
    d[y] = x
    if y == st:
        a = x
    if y == ed:
        b = x
w = d[st]
print(w, b) if a > b else print(b, w)