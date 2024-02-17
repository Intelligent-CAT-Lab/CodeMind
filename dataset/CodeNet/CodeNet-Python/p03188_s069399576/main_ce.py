k = int("2")
if k == 1:
    print(1)
    print(1)
    exit()
n = (k + 3) // 4 * 2
l = 2 * n - k
print(n)
for i in range(n):
    for j in range(n):
        if j % 2 == 0 or (i + j) % n >= n - l:
            print((i + j) % n + 1, end = ' ')
        else:
            print(n + (i + j) % n + 1, end = ' ')
    print("")
