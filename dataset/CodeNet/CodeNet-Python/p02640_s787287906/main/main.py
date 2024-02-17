X, Y = list(map(int, input().split()))
if 2*X <= Y <= 4*X and Y % 2 == 0:
    print("Yes")
else:
    print("No")