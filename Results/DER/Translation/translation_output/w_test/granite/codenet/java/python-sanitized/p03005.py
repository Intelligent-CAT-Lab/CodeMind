import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    if k == 1:
        ans = 0
    else:
        ans = n - k
    print(ans)

if __name__ == "__main__":
    main()