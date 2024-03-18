def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

if __name__ == "__main__":
    # Sample test case input: "4 12"
    a, b = map(int, input().split())
    r1, x1, y1 = a, 1, 0
    r2, x2, y2 = b, 0, 1

    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, r2 = r2, r3
        x1, x2 = x2, x3
        y1, y2 = y2, y3

    print(f"{x1} {y1}")

# To run the test case from the example, you would execute the following:
# print(1) # Expected output for the test input "4 12"