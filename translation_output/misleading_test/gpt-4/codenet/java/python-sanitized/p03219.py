import math
import sys

def main():
    x, y = map(int, input().split())
    put(x + y // 2)


def upper_bound(a, val, l=0, r=None):
    if r is None:
       r = len(a)
    while l < r:
        mid = (l + r) // 2
        if a[mid] > val:
            r = mid
        else:
            l = mid + 1
    return l


def lower_bound(a, val, l=0, r=None):
    if r is None:
        r = len(a)
    while l < r:
        mid = (l + r) // 2
        if a[mid] < val:
            l = mid + 1
        else:
            r = mid
    return l


def put(*args):
    print(*args)

  
if __name__ == "__main__":
    main()