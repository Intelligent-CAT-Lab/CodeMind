import sys
from math import gcd
from bisect import bisect_left, bisect_right
from itertools import permutations

def solve():
    a = abs(int(input()) - int(input()))
    b = abs(int(input()) - int(input()))
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

def inrange(y, x, h, w):
    return 0 <= y < h and 0 <= x < w

def lower_bound(arr, key):
    return bisect_left(arr, key)

def upper_bound(arr, key):
    return bisect_right(arr, key)

def next_permutation(arr):
    n = len(arr)
    last_index = n - 2
    while last_index >= 0 and arr[last_index] >= arr[last_index + 1]:
        last_index -= 1
    if last_index < 0:
        return False
    swap_index = n - 1
    while arr[last_index] >= arr[swap_index]:
        swap_index -= 1
    arr[last_index], arr[swap_index] = arr[swap_index], arr[last_index]
    arr[last_index + 1:] = reversed(arr[last_index + 1:])
    return True

if __name__ == "__main__":
    solve()