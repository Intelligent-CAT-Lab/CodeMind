class main:
    a, b = map(int, input().split())
    if a <= 0 and b <= 0:
        print("Zero")
    else:
        print((min(0, b) - min(-1, a)) % 2 == 1 ? "Positive" : "Negative")