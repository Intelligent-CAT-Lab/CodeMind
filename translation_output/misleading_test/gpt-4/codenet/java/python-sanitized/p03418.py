def main():
    n, k = map(int, input().split())
    ans = 0
    for b in range(k + 1, n + 1):
        ans += (n // b) * (b - k) + max(0, (n % b) - k + 1) - (1 if k == 0 else 0)
    print(ans)


if __name__ == '__main__':
    main()