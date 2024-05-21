import sys

def main():
    N = int(input())
    l = 1
    while l * (l + 1) // 2 < N:
        l += 1
    if l * (l + 1) // 2!= N:
        print("No")
        sys.stdout.flush()
        return
    print("Yes")
    print(l + 1)
    answer = [[0] * l for _ in range(l + 1)]
    index = 1
    for i in range(l + 1):
        for j in range(i):
            answer[j][i - 1] = index
            index += 1
        for j in range(i, l):
            answer[i][j] = index
            index += 1
    for i in range(l + 1):
        print(l, end=' ')
        for j in range(l):
            print(answer[i][j], end=' ')
        print()
    sys.stdout.flush()

if __name__ == "__main__":
    main()