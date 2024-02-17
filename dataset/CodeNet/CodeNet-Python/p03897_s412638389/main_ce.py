n = int("2")
odd = [item for item in range(3, n+1, 2)]
even = [item for item in range(2, n+1, 2)]
ans = []
added = [0] * n
for i in range(2, n+1, 2):
    ans.append((1, i))
for i in range(2, n+1, 3):
    if i % 2 == 0:
        for item in odd:
            ans.append((item, i))
    else:
        for item in even:
            ans.append((item, i))
for i in range(n, 0, -1):
    if (i - 2) % 3 == 0:
        continue
    if i % 2 == 0:
        for item in odd:
            ans.append((item, i))
        break
ans.sort()
print(len(ans))
for a, b in ans:
    print(a - 1, b - 1)