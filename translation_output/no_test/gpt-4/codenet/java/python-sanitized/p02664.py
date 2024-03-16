c = list(input())
count = 0
for i in range(len(c)):
    if c[i] == 'D' or c[i] == '?':
        count += 1
        c[i] = 'D'
    print(c[i], end='')
print()