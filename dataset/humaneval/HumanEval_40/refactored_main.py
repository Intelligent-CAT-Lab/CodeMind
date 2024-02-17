l = [1, 3, 5, 0]
for i in range(len(l)):
    for j in range(i + 1, len(l)):
        for k in range(j + 1, len(l)):
            if l[i] + l[j] + l[k] == 0:
                result = True
print(result)