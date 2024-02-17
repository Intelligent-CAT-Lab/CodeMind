d = {1: 2, 2: 4, 3: 3}
k = 3
new_d = {}
for key, val in d.items():
    if key < k:
        new_d[key] = val
print(new_d)