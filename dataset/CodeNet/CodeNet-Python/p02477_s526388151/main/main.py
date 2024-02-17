# -*- coding: utf-8 -*-
"""
Big Integers - Multiplication of Big Integers II
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=NTL_2_F&lang=jp

"""
import sys


def main(args):
    A, B = list(map(int, input().split()))
    print((A * B))


if __name__ == '__main__':
    main(sys.argv[1:])

