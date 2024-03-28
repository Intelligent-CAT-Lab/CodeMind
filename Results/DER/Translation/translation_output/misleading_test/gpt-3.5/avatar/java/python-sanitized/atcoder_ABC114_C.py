def main():
    N = int(input())
    S = str(N)
    ans = 0
    for i in range(3, len(S)):
        ans += 3**i - 3 * 2**i + 3
    ans += f(3 * 10**(len(S) - 1), len(S) - 2, N)
    ans += f(5 * 10**(len(S) - 1), len(S) - 2, N)
    ans += f(7 * 10**(len(S) - 1), len(S) - 2, N)
    print(ans)

def f(a, m, N):
    if m >= 0:
        return f(a + 3 * 10**m, m - 1, N) + f(a + 5 * 10**m, m - 1, N) + f(a + 7 * 10**m, m - 1, N)
    else:
        s = str(a)
        if '3' in s and '5' in s and '7' in s and a <= N:
            return 1
        else:
            return 0

if __name__ == '__main__':
    main()