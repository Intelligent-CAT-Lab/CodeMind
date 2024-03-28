import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    sum = r * 100 + g * 10 + b
    print("YES" if sum % 4 == 0 else "NO")

if __name__ == "__main__":
    main()