import sys

def main():
    N = int(input())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N!= l:
        print("No")
        sys.stdout.flush()
        return
    print("Yes")
    print(l + 1)
    answer = [[0] * l for _ in range(l + 1)]
    index = 1
    for i in range(l + 1):
        s = [str(l)]
        for j in range(i):
            s.append(str(answer[j][i - 1]))
        for j in range(i, l):
            s.append(str(answer[i][j] = index))
            index += 1
        print(" ".join(s))
    sys.stdout.flush()

if __name__ == "__main__":
    main()