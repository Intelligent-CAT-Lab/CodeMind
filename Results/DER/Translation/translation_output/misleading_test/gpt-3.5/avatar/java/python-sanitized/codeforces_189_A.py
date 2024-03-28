import sys

def main():
    n, a, b, c = map(int, sys.stdin.readline().split())
    codes = [a, b, c]
    codes.sort()
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n + 1):
        for j in range(3):
            if i - codes[j] >= 0 and d[i - codes[j]] != -1:
                d[i] = max(d[i], d[i - codes[j]] + 1)
    print(d[n])

if __name__ == "__main__":
    main()