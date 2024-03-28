class main:
    n, k = map(int, input().split())
    if (n*k) % 2 == 1:
        print("Yes")
    else:
        print("No")