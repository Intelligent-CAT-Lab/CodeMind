def main():
    N, MOD = map(int, input().split())

    table = [[0] * (N + 1) for _ in range(N + 1)]
    for rem in range(N + 1):
        table[N][rem] = rem
    for pos in range(N - 1, 0, -1):
        for rem in range(N + 1):
            table[pos][rem] = table[pos + 1][rem]
            factor = min(pos, (N + 1) - pos)
            if factor < rem:
                table[pos][rem] += table[pos][rem - factor]
                table[pos][rem] %= MOD

    print(table[1][N])


if __name__ == "__main__":
    main()