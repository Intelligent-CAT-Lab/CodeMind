def main():
    n, m = map(int, input().split())

    if n % 2 == 0:
        half_n = n // 2
        print(0, end='')
        for _ in range(1, half_n):
            print(' 0', end='')
        for _ in range(half_n + 1, n):
            print(f' {m}', end='')
    else:
        half_n = n // 2
        print(0, end='')
        for _ in range(1, half_n):
            print(' 0', end='')
        for _ in range(half_n + 1, n):
            print(f' {m}', end='')

    print()

if __name__ == "__main__":
    main()