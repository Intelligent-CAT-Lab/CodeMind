import sys

def main():
    N = int(sys.stdin.readline().strip())
    l = 1
    while N - l >= l + 1:
        N -= l
        l += 1
    if N != l:
        print("No")
        return
    print("Yes")
    print(l + 1)
    answer = [[0] * l for _ in range(l + 1)]
    Index = 1
    for i in range(l + 1):
        print(l, end=' ')
        for j in range(i):
            print(answer[j][i - 1], end=' ')
        for j in range(i, l):
            answer[i][j] = Index
            Index += 1
            print(answer[i][j], end=' ')
        print()

if __name__ == "__main__":
    main()