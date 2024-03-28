def main():
    N, M = map(int, input().split())
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum += (M - N * 2) // 4

    print(sum)

if __name__ == "__main__":
    main()