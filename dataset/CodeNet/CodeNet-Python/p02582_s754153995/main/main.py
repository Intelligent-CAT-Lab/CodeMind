import sys

readline = sys.stdin.readline
MOD = 10 ** 9 + 7
INF = float('INF')
sys.setrecursionlimit(10 ** 5)


def main():
    s = eval(input())

    if s == "RRR":
        print((3))
    elif "RR" in s:
        print((2))
    elif "R" in s:
        print((1))
    else:
        print((0))


if __name__ == '__main__':
    main()
