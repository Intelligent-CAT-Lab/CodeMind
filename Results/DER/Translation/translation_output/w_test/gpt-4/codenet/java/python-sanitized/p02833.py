def main():
    n = int(input())
    if n % 2 == 1:
        print(0)
        return

    ans = 0
    base = 10
    while True:
        if base > n:
            break
        ans += n // base
        base *= 5
    print(ans)

if __name__ == "__main__":
    main()