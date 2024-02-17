l = [1, 3, 5, 0]
for i, l1 in enumerate(l):
    for j in range(i + 1, len(l)):
        if l1 + l[j] == 0:
            result = True
            break
    else:
        continue
    break
else:
    result = False
print(result)