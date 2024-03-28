import sys

def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(GCD(a, b))