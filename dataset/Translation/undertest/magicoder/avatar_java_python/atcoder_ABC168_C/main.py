import math

def main():
    a, b, tmp1, tmp2 = map(int, input().split())

    h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
    m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
    rad = h - m

    res = math.sqrt(a**2 + b**2 - 2*a*b*math.cos(rad))

    print(res)

if __name__ == "__main__":
    main()