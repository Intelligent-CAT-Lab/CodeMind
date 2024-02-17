import sys

sys.setrecursionlimit(10 ** 8)

input = sys.stdin.readline


def main():
    A, B, C, K = [int(x) for x in input().split()]

    ans = A - B
    if K % 2 == 0:
        print(ans)
    else:
        print(-ans)


if __name__ == '__main__':
    main()

