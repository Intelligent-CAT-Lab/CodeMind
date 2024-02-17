d = {'1': 'a', 1: 'a', 1: 'b', '1': 'b'}
rm = [1]
res = d.copy()
for k in rm:
    if k in res:
        del res[k]
print(res)