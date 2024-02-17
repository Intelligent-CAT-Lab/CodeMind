def check_uruu(y):
    if y % 400 == 0:
        return True
    elif y % 100 == 0:
        return False
    elif y % 4 == 0:
        return True
    else:
        return False
nouruu = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
uruu = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

Y1, M1, D1, Y2, M2, D2 = list(map(int, input().split()))
L = [0] * (2800*366)
idx = 0
di, Y1 = divmod(Y1, 2800)
ans1 = di * 4816
di, Y2 = divmod(Y2, 2800)
ans2 = di * 4816

for y in range(0, 2800):
    if check_uruu(y):
        l = uruu
    else:
        l = nouruu
    for m, n_days in enumerate(l, 1):
        # if y==2015 and m==3:
        #     print(idx, idx + 12)

        d_13 = idx + 12
        if d_13 % 7 == 6:
            L[d_13] = 1

        if Y1==y and M1==m:
            ans1 += sum(L[:idx + (D1-1)])
        if Y2==y and M2==m:
            ans2 += sum(L[:idx + (D2)])

        idx += n_days
print((ans2-ans1))

