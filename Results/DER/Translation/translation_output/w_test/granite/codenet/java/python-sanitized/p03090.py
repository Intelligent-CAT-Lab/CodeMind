def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append((i, j))
                l.append((i, a + 1 - j))
                l.append((a + 1 - i, j))
                l.append((a + 1 - i, a + 1 - j))
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append((a, i))

a = int(input())
l = []
solve(a, l)
print(len(l))
for i, j in l:
    print(i, j)