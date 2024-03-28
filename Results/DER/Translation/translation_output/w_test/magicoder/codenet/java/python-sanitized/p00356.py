# Python code

def gcd(x, y):
    while(y):
        x, y = y, x % y
    return x

def main():
    x, y = map(int, input().split())
    a, b = x, y
    m = a + b - gcd(a, b)

    if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()