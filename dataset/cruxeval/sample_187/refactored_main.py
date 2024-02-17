d = {27:39}
index = 1
length = len(d.items())
idx = index % length
v = d.popitem()[1]
for _ in range(idx):
    d.popitem()
print(v)