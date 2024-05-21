import sys

def main():
    s = input()
    n = int(s)
    ans = 0
    for i in range(3, len(s)):
        ans += 3**i - 3*2**i + 3
    ans += f(3 * 10**(len(s) - 1), len(s) - 2)
    ans += f(5 * 10**(len(s) - 1), len(s) - 2)
    ans += f(7 * 10**(len(s) - 1), len(s) - 2)
    print(ans)

def f(a, m):
    if m >= 0:
        return f(a + 3 * 10**m, m - 1) + f(a + 5 * 10**m, m - 1) + f(a + 7 * 10**m, m - 1)
    else:
        s = str(a)
        if "3" in s and "5" in s and "7" in s and a <= n:
            return 1
        else:
            return 0

if __name__ == "__main__":
    sys.setrecursionlimit(10**6)
    main()