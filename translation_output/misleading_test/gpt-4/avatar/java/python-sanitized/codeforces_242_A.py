x, y, a, b = map(int, input().split())
res = []
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        res.append(f"{i} {j}")

print(len(res))
for elem in res:
    print(elem)