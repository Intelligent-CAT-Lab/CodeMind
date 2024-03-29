def main():
    N, M, K = map(int, input().split())

    for i in range(N+1):
        for j in range(M+1):
            sum = M * i + N * j - (i * j * 2)
            if sum == K:
                print("Yes")
                return
    print("No")

if __name__ == "__main__":
    main()