import sys

def solve(a, b):
    return max(max(a+b, a-b), a*b)

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    print(solve(a, b))