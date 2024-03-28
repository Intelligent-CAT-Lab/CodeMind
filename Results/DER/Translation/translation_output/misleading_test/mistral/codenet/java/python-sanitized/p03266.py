N, K = map(int, input().split())

if K % 2 == 0:
    c1 = N // K
    c2 = N // (K // 2) - c1
    print(c1**3 + c2**3)
else:
    c = N // K
    print(c**3)