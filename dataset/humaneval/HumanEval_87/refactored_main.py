lst = []
x = 1
coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
print(sorted(sorted(coords, key=lambda x: x[1], reverse=True), key=lambda x: x[0]))