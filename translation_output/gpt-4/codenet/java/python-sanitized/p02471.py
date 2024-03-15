def main():
    a = int(input())
    b = int(input())
    r1, x1, y1 = a, 1, 0
    r2, x2, y2 = b, 0, 1

    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, x1, y1 = r2, x2, y2
        r2, x2, y2 = r3, x3, y3

    print(f"{x1} {y1}")

if __name__ == "__main__":
    main()