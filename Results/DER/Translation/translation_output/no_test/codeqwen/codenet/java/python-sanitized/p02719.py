def main():
    n = int(input())
    k = int(input())
    ans = min(n % k, k - (n % k))
    print(ans)

if __name__ == "__main__":
    main()