import sys

def main():
    n, x, t = map(int, sys.stdin.readline().split())
    ans = 0
    tako = 0
    while n > tako:
        ans += t
        tako += x
    print(ans)

if __name__ == "__main__":
    main()