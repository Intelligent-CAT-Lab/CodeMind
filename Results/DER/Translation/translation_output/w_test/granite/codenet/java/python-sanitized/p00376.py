import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    ans = abs(a - b)
    print(ans)

if __name__ == "__main__":
    main()