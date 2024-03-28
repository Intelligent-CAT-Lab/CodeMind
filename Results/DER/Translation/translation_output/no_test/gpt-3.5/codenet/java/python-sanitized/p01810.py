def main():
    N, K = map(int, input().split())
    ans = 0
    for i in range(N - 1):
        ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
    print(ans)

if __name__ == "__main__":
    main()