import math

def solve(a, b):
    print(4.0/3.0*math.pi*b*b*b)

if __name__ == '__main__':
    a, b = map(float, input().split())
    solve(a, b)