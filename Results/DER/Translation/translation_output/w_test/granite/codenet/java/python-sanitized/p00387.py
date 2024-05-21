import math

def solve(a, b):
    return math.ceil((b + a - 1) / a)

def main():
    a, b = map(int, input().split())
    print(solve(a, b))

if __name__ == "__main__":
    main()