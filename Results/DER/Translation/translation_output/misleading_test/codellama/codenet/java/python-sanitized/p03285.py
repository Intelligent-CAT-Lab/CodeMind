import math

def is_divisible_by_4(n):
    return n % 4 == 0

def is_divisible_by_7(n):
    return n % 7 == 0

def is_divisible_by_4_and_7(n):
    return is_divisible_by_4(n) and is_divisible_by_7(n)

def solve(n):
    if is_divisible_by_4_and_7(n):
        return "Yes"
    else:
        return "No"

n = int(input())
print(solve(n))