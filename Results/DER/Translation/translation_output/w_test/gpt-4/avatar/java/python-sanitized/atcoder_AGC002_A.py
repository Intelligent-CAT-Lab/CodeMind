def atcoder_AGC002_A():
    a, b = map(int, input().split())

    if a <= 0 and b >= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

# Sample test case input:
# -1000000000 -1
# Expected output: Positive
atcoder_AGC002_A()