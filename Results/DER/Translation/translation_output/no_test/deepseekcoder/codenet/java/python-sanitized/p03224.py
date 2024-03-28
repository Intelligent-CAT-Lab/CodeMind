import sys

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
        print(l, end='')
        for j in range(i):
            print(" ", j, answer[j][i-1], end='')
        for j in range(i, l):
            print(" ", j, (answer[i][j] := Index), end='')
            Index += 1
        print()

if __name__ == "__main__":
    main()