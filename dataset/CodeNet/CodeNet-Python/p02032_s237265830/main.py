#!/usr/bin/env python3
# -*- coding: utf-8 -*-
''' 
------------------------
author : iiou16
------------------------
'''
import copy

def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)

    divisors.sort()
    return divisors


def main():
    N = int(input())
    yakusu = make_divisors(N)
    max_times = len(yakusu) - 1
    min_times = 0
    result = []
    for i in reversed(yakusu[:-1]):
        if i in result:
            continue
        result.extend(make_divisors(i))
        # print(result)
        min_times += 1
    print(min_times, max_times)


if __name__ == '__main__':
    main()
