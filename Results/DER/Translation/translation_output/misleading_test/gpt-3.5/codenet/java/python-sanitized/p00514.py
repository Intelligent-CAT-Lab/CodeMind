from math import factorial

if __name__ == "__main__":
    a, b, c = map(int, input().split())
    if a * b > c:
        print(0)
        exit()
    c -= a * b
    d = c + a - 1
    result = 1
    for i in range(c):
        result *= (d - i)
        result //= (i + 1)
    print(result)