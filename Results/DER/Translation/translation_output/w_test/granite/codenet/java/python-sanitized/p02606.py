import sys

def main():
    L, R, d = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(L, R + 1):
        if i % d == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()