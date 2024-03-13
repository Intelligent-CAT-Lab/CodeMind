import sys

def main():
    L, R, d = map(int, sys.stdin.readline().split())

    Ans = 0
    for i in range(L, R + 1):
        if i % d == 0:
            Ans += 1

    print(Ans)

if __name__ == "__main__":
    main()