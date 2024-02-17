#!/usr/bin/python3

import os
import sys


def main():
    T = read_int()
    print(solve(T))


def solve(T):
    if T <= 3:
        return T

    sec = 1
    T -= 1
    f = 3
    while T >= 2 * f:
        T -= 2 * f
        f *= 3
        sec += 2

    if T >= f:
        T -= f
        sec += 1
    else:
        f //= 3

    while T > 0:
        t = T // f
        T -= t * f
        sec += t
        f //= 3

    return sec


###############################################################################

DEBUG = 'DEBUG' in os.environ


def inp():
    return sys.stdin.readline().rstrip()


def read_int():
    return int(inp())


def read_ints():
    return [int(e) for e in inp().split()]


def dprint(*value, sep=' ', end='\n'):
    if DEBUG:
        print(*value, sep=sep, end=end)


if __name__ == '__main__':
    main()

