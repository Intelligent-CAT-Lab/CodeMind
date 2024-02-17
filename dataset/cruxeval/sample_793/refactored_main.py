list = [1, 2, 4, 3, 2, 1]
start = 0
end = 3
count = 0
for i in range(start, end):
    for j in range(i, end):
        if list[i] != list[j]:
            count += 1
print(count)