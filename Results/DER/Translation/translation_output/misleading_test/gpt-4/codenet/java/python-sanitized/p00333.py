def gcd(x, y):
    while y != 0:
        x, y = y, x % y
    return x

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W // WH) * (H // WH)
    print(a * C)

if __name__ == "__main__":
    main()