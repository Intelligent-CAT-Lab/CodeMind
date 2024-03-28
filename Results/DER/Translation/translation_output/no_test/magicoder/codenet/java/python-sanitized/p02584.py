import sys

def main():
    x, k, d = map(int, sys.stdin.readline().split())
    x = abs(x)
    ans = 0
    if x // d >= k:
        ans = x - k * d
    else:
        sho = x // d
        amari = x % d
        if (k - sho) % 2 == 0:
            ans = amari
        else:
            ans = d - amari
    print(ans)

if __name__ == "__main__":
    main()