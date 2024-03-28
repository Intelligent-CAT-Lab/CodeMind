import sys

def main():
    N = int(sys.stdin.readline())
    l = 1
    while N > l:
        N -= l
        l += 1
    if N != l:
        print("No")
        return
    print("Yes")
    print(l)
    answer = [[0]*l for _ in range(l+1)]
    index = 1
    for i in range(l+1):
        print(l, end='')
        for j in range(i):
            print(' ', answer[j][i-1], end='')
        for j in range(i, l):
            print(' ', index, end='')
            answer[i][j] = index
            index += 1
        print()

if __name__ == "__main__":
    main()