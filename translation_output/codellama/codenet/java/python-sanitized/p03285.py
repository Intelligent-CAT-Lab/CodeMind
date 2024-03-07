import math

def is_divisible_by_7(n):
    return n % 7 == 0

def is_divisible_by_4(n):
    return n % 4 == 0

def is_divisible_by_7_and_4(n):
    return is_divisible_by_7(n) and is_divisible_by_4(n)

def is_divisible_by_7_or_4(n):
    return is_divisible_by_7(n) or is_divisible_by_4(n)

def is_divisible_by_7_and_4_or_both(n):
    return is_divisible_by_7_and_4(n) or is_divisible_by_7(n) and is_divisible_by_4(n)

def is_divisible_by_7_or_4_or_both(n):
    return is_divisible_by_7_or_4(n) or is_divisible_by_7_and_4(n)

def is_divisible_by_7_and_4_or_both_or_neither(n):
    return is_divisible_by_7_and_4_or_both(n) or not is_divisible_by_7_or_4(n)

def is_divisible_by_7_or_4_or_both_or_neither(n):
    return is_divisible_by_7_or_4_or_both(n) or not is_divisible_by_7_and_4(n)

def is_divisible_by_7_and_4_or_both_or_neither_or_both(n):
    return is_divisible_by_7_and_4_or_both(n) or not is_divisible_by_7_or_4(n) or is_divisible_by_7_and_4(n)

def is_divisible_by_7_or_4_or_both_or_neither_or_both(n):
    return is_divisible_by_7_or_4_or_both(n) or not is_divisible_by_7_and_4(n) or is_divisible_by_7_and_4(n)

def is_divisible_by_7_and_4_or_both_or_neither_or_both_or_neither(n):
    return is_divisible_by_7_and_4_or_both(n) or not is_divisible_by_7_or_4(n) or is_divisible_by_7_and_4(n) or not is_divisible_by_7_and_4(n)

def is_divisible_by_7_or_4_or_both_or_neither_or_both_or_neither(n):
    return is_divisible_by_7_or_4_or_both(n) or not is_divisible_by_7_and_4(n) or is_divisible_by_7_and_4(n) or not is_divisible_by_7_and_4(n)