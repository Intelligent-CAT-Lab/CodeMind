class main:
    K, X = map(int, input().split())
    if X <= 500*K:
        print("Yes")
    else:
        print("No")