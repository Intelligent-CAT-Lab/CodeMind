import sys

def calculate_time(a, t, r):
    return r * t / a

a, t, r = map(int, sys.stdin.readline().split())
print(calculate_time(a, t, r))