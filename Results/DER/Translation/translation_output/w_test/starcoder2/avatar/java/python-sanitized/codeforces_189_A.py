import sys

def main():
    n, a, b, c = map(int, sys.stdin.readline().split())
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n + 1):
        for j in [a, b, c]:
            if i - j >= 0 and d[i - j] != -1:
                d[i] = max(d[i], d[i - j] + 1)
    print(d[n])

if __name__ == '__main__':
    main()