class main:
    a, b = map(int, input().split())
    if a <= 0 and b >= 0 or a <= 0 and b >= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print(((b - a + 1) % 2 == 0) ? "Positive" : "Negative")
    else:
        print("Positive")