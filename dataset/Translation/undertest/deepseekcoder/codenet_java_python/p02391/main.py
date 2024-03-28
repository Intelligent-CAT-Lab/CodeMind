import sys

def compare_numbers(x, y):
    if x == y:
        return "a == b"
    elif x < y:
        return "a < b"
    else:
        return "a > b"

x, y = map(int, sys.stdin.readline().split())
print(compare_numbers(x, y))