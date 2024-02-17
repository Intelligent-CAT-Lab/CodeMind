A, B, C = list(map(int, "2 5 4".split()))
a = sorted([A, B, C])
s = 0
for i in range(0, 2):
    tmp = a[2] - a[i]
    s += tmp // 2
    a[i] += tmp // 2 * 2
s += sum(a) % 3
print(s)