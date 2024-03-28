import math

def gcd(x, y):
    return math.gcd(x, y)

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W//WH)*(H//WH)
    print(a*C)

if __name__ == "__main__":
    main()