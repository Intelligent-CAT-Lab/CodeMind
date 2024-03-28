class main:
    n, k = map(int, input().split())
    i = 1
    req = 1
    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n
    print(k)