import sys

def main():
    N = int(sys.stdin.readline().strip())
    l = 1
    while N - l >= l:
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
        print(l, end='')
        for j in range(i):
            print(' ', l, answer[j][i - 1], sep='', end='')
        for j in range(i, l):
            print(' ', l, answer[i][j] := Index, sep='', end='')
            Index += 1
        print()

if __name__ == "__main__":
    main()