def f(n):
    t = 0
    b = ''
    digits = list(map(int, str(n)))
    for d in digits:
        if d == 0: t += 1
        else: break
    for _ in range(t):
        b += str(1) + '0' + str(4)
    b += str(n)
    return b