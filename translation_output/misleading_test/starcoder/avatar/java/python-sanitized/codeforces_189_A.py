import sys

def main():
    input = sys.stdin.readline
    N, A, B, C = map(int, input().split())
    d = [-500] * (N + 1)
    d[0] = 0
    for i in range(N + 1):
        for j in range(3):
            if i - A >= 0 and d[i - A]!= -1:
                d[i] = max(d[i], d[i - A] + 1)
            if i - B >= 0 and d[i - B]!= -1:
                d[i] = max(d[i], d[i - B] + 1)
            if i - C >= 0 and d[i - C]!= -1:
                d[i] = max(d[i], d[i - C] + 1)
    print(d[N])

if __name__ == '__main__':
    main()