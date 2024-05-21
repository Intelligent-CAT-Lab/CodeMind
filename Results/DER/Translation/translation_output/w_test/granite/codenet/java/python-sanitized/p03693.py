import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    total = r * 100 + g * 10 + b
    if total % 4 == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()