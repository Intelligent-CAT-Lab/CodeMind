import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    ab = abs(a - b)
    ac = abs(a - c)
    bc = abs(b - c)
    if ac <= d or (ab <= d and bc <= d):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()