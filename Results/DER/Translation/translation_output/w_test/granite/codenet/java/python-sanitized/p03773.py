import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    ans = A + B
    if ans > 23:
        ans -= 24
    print(ans)

if __name__ == "__main__":
    main()