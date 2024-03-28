class main:
    a, b, n = map(int, input().split())
    k = 0
    for i in range(1, int(n//a)+1):
        k += b
    print(k)