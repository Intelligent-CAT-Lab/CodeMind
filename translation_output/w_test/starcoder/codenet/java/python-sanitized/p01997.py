import math

def solve(a, b):
    return 4.0/3.0*math.pi*b*b*b

if __name__ == '__main__':
    a, b = map(float, raw_input().split())
    print solve(a, b)