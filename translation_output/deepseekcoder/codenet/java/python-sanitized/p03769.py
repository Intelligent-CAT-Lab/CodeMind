import io
import sys
import time
import bisect
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
        print(" ", i+1, end="")
    print()

def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = 2**(bin(k+1).count('1')) - 1
    lst = [i for i in range(bin(cur).count('1'))]
    p = len(lst)
    for d in range(len(lst)-1, -1, -1):
        x = 1<<d
        if cur + x <= k:
            cur += x
            lst.insert(d, p)
            p += 1
    return lst

def main():
    start = time.time()
    solve()
    print(flush=True)
    end = time.time()
    print(f"{end-start:.2f}ms")

def eof():
    if lenbuf == -1:
        return True
    lptr = ptrbuf
    while lptr < lenbuf