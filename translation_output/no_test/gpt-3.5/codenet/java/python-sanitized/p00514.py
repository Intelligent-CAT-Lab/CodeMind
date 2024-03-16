from math import factorial

def main():
    a, b, c = map(int, input().split())
    if a * b > c:
        print(0)
        return
    c -= a * b
    d = c + a - 1
    numerator = factorial(d)
    denominator = factorial(c) * factorial(a-1)
    result = numerator // denominator
    print(result)

if __name__ == "__main__":
    main()