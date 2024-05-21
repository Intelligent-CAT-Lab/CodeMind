def power(a, e, modP):
    ret = 1
    while e > 0:
        if e % 2!= 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
        e //= 2
    return ret

m, n = map(int, input().split())
print(power(m, n, 1000000007))