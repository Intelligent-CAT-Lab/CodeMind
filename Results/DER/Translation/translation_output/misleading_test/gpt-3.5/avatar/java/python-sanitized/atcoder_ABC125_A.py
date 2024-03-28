def atcoder_ABC125_A():
    n, k, m, l, a, b, c = map(int, input().split())
    k = 0
    for i in range(1, n//a + 1):
        k += b
    return k

result = atcoder_ABC125_A()
print(result)