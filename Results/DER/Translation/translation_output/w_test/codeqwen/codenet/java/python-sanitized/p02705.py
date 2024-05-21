import math

def solve(r):
    pi = math.pi
    return 2 * pi * r

def main():
    t = 1
    while t > 0:
        r = float(input())
        print(solve(r))
        t -= 1

if __name__ == "__main__":
    main()