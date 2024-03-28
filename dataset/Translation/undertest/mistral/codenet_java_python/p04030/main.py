import sys

def fact(n):
    if n == 1 or n == 0:
        return 1
    else:
        return n * fact(n-1)

def lower_bound(n, x, y):
    left = 0
    right = n
    while left < right:
        mid = (left + right) // 2
        if x[mid] < y:
            left = mid + 1
        else:
            right = mid
    return left

def upper_bound(n, x, y):
    left = 0
    right = n
    while left < right:
        mid