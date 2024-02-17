def _agc022_b(N):
    if N >= 4:
        S = []
        a = N // 8

        l = [2, 3, 4, 6, 8, 9, 10, 12]

        for i in range(a):
            for v in l:
                S.append(i * 12 + v)

        b = N % 8
        if b == 1:
            l = [6]
        elif b == 2:
            l = [6, 12]
        elif b == 3:
            l = [3, 6, 9]
        elif b == 4:
            l = [3, 4, 8, 9]
        elif b == 5:
            l = [2, 3, 6, 9, 10]
        elif b == 6:
            l = [2, 3, 4, 8, 9, 10]
        elif b == 7:
            l = [2, 3, 4, 6, 8, 9, 10]
        elif b == 0:
            l = []

        for v in l:
            S.append(a * 12 + v)
        print((' '.join(map(str, S))))
    elif N == 3:
        print('2 5 63')

N = int(eval(input()))
_agc022_b(N)