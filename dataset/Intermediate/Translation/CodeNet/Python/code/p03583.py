N = int(input())
n = 0
h = 0
w = 0

for i in range(1, 3501):
    for j in range(1, 3501):
        tmp1 = N * i * j
        tmp2 = (4 * i * j) - (N * j) - (N * i)
        if tmp2 != 0:
            s, m = divmod(tmp1, tmp2)
            if m == 0 and s >= 0:
                n, h, w = i, j, s
                print(n, h, w)
                exit()
