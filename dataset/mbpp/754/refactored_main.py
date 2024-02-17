l1 = [1, 1, 3, 4, 5, 6, 7]
l2 = [0, 1, 2, 3, 4, 5, 7]
l3 = [0, 1, 2, 3, 4, 5, 7]
result = []
for m, n, o in zip(l1, l2, l3):
    if (m == n == o):
        result.append(m)
print(result)