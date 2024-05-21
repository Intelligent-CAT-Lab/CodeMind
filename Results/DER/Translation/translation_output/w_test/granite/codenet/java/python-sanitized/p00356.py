import math

def main():
    x, y = map(int, input().split())
    gcd = math.gcd(x, y)
    lcm = x * y // gcd
    if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
        print(lcm // gcd + 1)
    else:
        print(lcm // gcd)

if __name__ == "__main__":
    main()