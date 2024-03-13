import sys

def main():
    ans = 0
    n = int(sys.stdin.readline())
    k = int(sys.stdin.readline())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

if __name__ == "__main__":
    main()