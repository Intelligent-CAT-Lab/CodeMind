MOD = 1000000007

first_N, first_M = map(int, input().split())

if first_N == 1:
    print((first_M + 1) % MOD)
else:
    if (first_M + 1) % (first_N - 1) == 0:
        first_limit = (first_M + 1) // (first_N - 1) - 1
    else:
        first_limit = (first_M + 1) // (first_N - 1)

    if first_limit <= 0:
        print((first_M + 1) % MOD)
    else:
        limit = first_limit

        A = first_M + 1
        B = 2 * (first_M + 1) * limit
        C = (first_N - 1) * limit * (first_limit + 1)

        result = (A + B - C) % MOD

        print(result)