lst = [1, 2, 3, 4]
res = []
for i in range(len(lst)):
    if lst[i] % 2 == 0:
        res.append(lst[i])
print(lst.copy())