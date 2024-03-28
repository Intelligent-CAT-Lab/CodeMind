import sys

def solve(t, s, q):
    sum = 0
    while s < t:
        s = s * q
        sum += 1
    return sum

def main():
    t, s, q = map(int, input().split())
    print(solve(t, s, q))

if __name__ == "__main__":
    main()