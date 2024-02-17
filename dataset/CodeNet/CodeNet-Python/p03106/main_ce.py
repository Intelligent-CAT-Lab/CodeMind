a, b, k = map(int, "8 12 2".split())
res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)
res.sort(reverse=True)
print(res[k-1])
