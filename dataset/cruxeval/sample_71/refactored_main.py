d = {1: 2, 3: 4, 5: 6, 7: 8, 9: 10}
n = 1
for i in range(n):
    item = d.popitem()
    d[item[1]] = item[0]
print(d)