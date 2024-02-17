if __name__ == "__main__":
    N,M,K = map(int, input().split())
    for x in range(N + 1):
        for y in range(M + 1):
            res = x * M + y * N - x * y * 2
            if res == K:
                print ("Yes")
                exit()
    print ("No")