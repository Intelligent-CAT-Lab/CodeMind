import sys

def main():
    S = input()
    N = int(S)
    ans = 0
    for i in range(3, len(S) - 1 + 1):
        ans += pow(3, i) - 3 * pow(2, i) + 3
    ans += f(3 * pow(10, len(S) - 1), len(S) - 2)
    ans += f(5 * pow(10, len(S) - 1), len(S) - 2)
    ans += f(7 * pow(10, len(S) - 1), len(S) - 2)
    print(ans)

def f(a, m):
    if m >= 0:
        return f(a + 3 * pow(10, m), m - 1) + f(a + 5 * pow(10, m), m - 1) + f(a + 7 * pow(10, m), m - 1)
    else:
        s = str(a)
        if "3" in s and "5" in s and "7" in s and a <= N:
            return 1
        else:
            return 0

if __name__ == "__main__":
    main()