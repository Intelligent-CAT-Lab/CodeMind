# ABC074C - Sugar Water
# input
a, b, c, d, e, f = list(map(int, input().rstrip().split()))
A = a * 100
B = b * 100

# default values
x, y = min(a, b) * 100, 0
dens = y / x


# exhaustive search
for i in range(f // A + 1):
    for j in range(((f - A * i) // B) + 1):
        if i == 0 and j == 0:
            continue
        water = i * A + j * B
        rest = f - water
        for k in range(rest // c + 1):
            for l in range((rest - c * k) // d + 1):
                sugar = c * k + d * l
                total = water + sugar

                if sugar / total > e / (e + 100):  # compare to e (the max density)
                    break
                else:
                    if sugar / total > dens:
                        dens = sugar / total
                        x, y = total, sugar
print((x, y))