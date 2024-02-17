N, M = map(int, "2 1".split())
count = 0
if N != 0:
    count += N * (N -1) // 2
if M != 0:
    count += M * (M -1) // 2
print(count)