import math

def main():
    a, b, h, m = map(float, input().split())
    rad = math.radians(h * 30 - m * 60)
    res = math.sqrt(a**2 + b**2 - 2 * a * b * math.cos(rad))
    print(res)

if __name__ == "__main__":
    main()