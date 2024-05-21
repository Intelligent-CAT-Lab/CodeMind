def solve():
    n, d1, d2 = map(int, input().split())
    d1s = 0
    d2s = 0
    while d1 % 4 == 0:
        d1 //= 4
        d1s += 1
    while d2 % 4 == 0:
        d2 //= 4
        d2s += 1
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if (d1 % 4 == 1 and (i >> d1s) % 2!= (j >> d1s) % 2) or \
               (d1 % 4 == 2 and (i >> d1s) % 2 == 1) or \
               (d2 % 4 == 1 and (i >> d2s) % 2!= (j >> d2s) % 2) or \
               (d2 % 4 == 2 and (i >> d2s) % 2 == 1):
                continue
            print(i, j)
            need -= 1
            if need == 0:
                return

solve()