import sys

def calculate_volume(a, t, r):
    return r * t / a

if __name__ == "__main__":
    a, t, r = map(float, sys.stdin.readline().split())
    print(calculate_volume(a, t, r))