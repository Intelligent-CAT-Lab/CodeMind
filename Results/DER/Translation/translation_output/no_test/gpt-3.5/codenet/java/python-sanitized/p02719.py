def main():
    n, k = map(int, input().split())
    ans = min(n % k, k - (n % k))
    print(ans)

if __name__ == "__main__":
    main()