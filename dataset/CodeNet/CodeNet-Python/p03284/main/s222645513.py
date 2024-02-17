# -*- coding: utf-8 -*-


def main():
    n, k = list(map(int, input().split()))

    if n % k == 0:
        print((0))
    else:
        print((1))


if __name__ == '__main__':
    main()
