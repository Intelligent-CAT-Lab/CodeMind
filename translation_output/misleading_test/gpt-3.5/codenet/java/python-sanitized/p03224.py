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
    print(l + 1)
    answer = [[0 for _ in range(l)] for _ in range(l + 1)]
    Index = 1
    for i in range(l + 1):
        string = [str(l)]
        for j in range(i):
            string.append(str(answer[j][i - 1]))
        for j in range(i, l):
            answer[i][j] = Index
            Index += 1
            string.append(str(answer[i][j]))
        print(" ".join(string))

if __name__ == "__main__":
    main()