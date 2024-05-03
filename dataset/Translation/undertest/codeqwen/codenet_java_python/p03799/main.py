def main():
    N = int(input())
    M = int(input())
    ans = 0

    if N > M:
        print(M//2)
        return

    if N == 1 and M == 1:
        print(0)
        return

    if N == 2 and M == 1:
        print(0)
        return

    if N * 2 > M:
        print(M//2)
        return

    ans = N + ((M - N * 2) // 4)

    # for _ in range(1000):  # Uncomment this line to mimic the Java loop
    #     if M - 2 >= (N + 1) * 2:
    #         M -= 2
    #         N += 1
    #     else:
    #         break

    print(ans)


if __name__ == "__main__":
    main()