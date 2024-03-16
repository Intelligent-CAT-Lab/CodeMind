import sys
import io
import re
import math
import collections

def solve():
    n = ni()
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm)*2)
    for i in range(1, len(perm)+1):
        if i > 1:
            print(" ", end="")
        print(i, end="")
    for i in perm:
        print(" ", end="")
        print(i+1, end="")
    print()

def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = (1 << (k.bit_length() - 1)) - 1
    lst = [i for i in range(cur.bit_count())]
    p = cur.bit_count()
    for d in range(cur.bit_count()-1, -1, -1):
        x = 1 << d
        if cur + x <= k:
            cur += x
            lst.insert(d, p)
            p += 1
    return lst

def main():
    global INPUT
    INPUT = sys.stdin.read()
    solve()

def eof():
    return len(INPUT) == 0

def read_byte():
    global INPUT
    if eof():
        return -1
    return INPUT.pop(0)

def is_space_char