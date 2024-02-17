list = [63, 0, 1, 5, 9, 87, 0, 7, 25, 4]
for i in range(len(list) - 1, 0, -1):
    for j in range(i):
        if list[j] > list[j + 1]:
            list[j], list[j + 1] = list[j + 1], list[j]
            list.sort()
print(list)