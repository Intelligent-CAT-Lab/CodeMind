n = 12
values = {0: 3, 1: 4.5, 2: '-'}
res = {}
for i, j in values.items():
    if i % n != 2:
        res[j] = n // 2
print(sorted(res))