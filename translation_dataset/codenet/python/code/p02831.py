def gcd(a, b):
    '''ユークリッド互除法を使った最大公約数の求め方'''
    while b != 0:
        a, b = b, a % b
    return(a)


def lcm(a, b):
    '''最小公倍数の求め方'''
    return a * b // gcd(a, b)

A, B = list(map(int, input().split()))

print(lcm(A,B))