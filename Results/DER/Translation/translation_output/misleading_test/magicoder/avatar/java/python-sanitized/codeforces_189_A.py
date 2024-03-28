import sys

def main():
    n = int(sys.stdin.readline())
    codeforces_189_A = list(map(int, sys.stdin.readline().split()))
    codeforces_189_A.sort()
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n + 1):
        for j in range(3):
            if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]] != -1:
                d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
    print(d[n])

if __name__ == "__main__":
    main()