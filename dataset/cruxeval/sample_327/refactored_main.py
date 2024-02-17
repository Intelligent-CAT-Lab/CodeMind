lst = [1, 7, -1, -3]
new = list()
i = len(lst)-1
for _ in range(len(lst)):
    if i%2 == 0:
        new.append(-lst[i])
    else:
        new.append(lst[i])
    i -= 1
print(new)