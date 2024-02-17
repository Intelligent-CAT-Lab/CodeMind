m = {'l':4, 'h':6, 'o':9}
items = list(m.items())
for i in range(len(items)-2, -1, -1):
    tmp = items[i]
    items[i] = items[i+1] 
    items[i+1] = tmp
print(['{}={}', '{1}={0}'][len(items) % 2].format(
    *m.keys(), **m
))