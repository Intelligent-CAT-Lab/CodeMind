def main():
    N = int(input())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N != l:
        print("No")
        return
    print("Yes")
    print(l+1)
    answer = [[0]*l for _ in range(l+1)]
    Index = 1
    for i in range(l+1):
        line = [l]
        for j in range(i):
            line.append(answer[j][i-1])
        for j in range(i, l):
            answer[i][j] = Index
            line.append(Index)
            Index += 1
        print(*line)

if __name__ == "__main__":
    main()