import math

def solve(a, b):
    return 4/3 * math.pi * b**3

def main():
    a, b = map(float, input().split())
    print(solve(a, b))

if __name__ == "__main__":
    main()