K, A, B = list(map(int, input().split()))
if A <= B and K > A:
    print((-1))
elif A >= K:
    print((1))
else:
    print((1 - int(- (K-A) // (A-B))*2))