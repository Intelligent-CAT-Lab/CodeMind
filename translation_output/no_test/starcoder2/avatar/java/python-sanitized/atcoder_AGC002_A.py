a, b = map(int, input().split())
if a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    if (b - a + 1) % 2 == 0:
        print("Positive")
    else:
        print("Negative")
else:
    print("Positive")