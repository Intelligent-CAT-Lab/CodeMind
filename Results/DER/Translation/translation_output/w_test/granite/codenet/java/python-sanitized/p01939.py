MOD = 1000000007

def main():
    first_N, first_M = map(int, input().split())

    first_limit = (first_M + 1) // (first_N - 1) - 1 if (first_M + 1) % (first_N - 1) == 0 else (first_M + 1) // (first_N - 1)

    if first_limit <= 0:
        print((first_M + 1) % MOD)
    else:
        limit = first_limit
        A = first_M + 1
        B = 2 * (first_M + 1) * limit
        C = (first_N - 1) * limit * (limit + 1)
        print((A + B - C) % MOD)

if __name__ == "__main__":
    main()