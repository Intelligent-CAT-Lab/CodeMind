import sys

def problem102a(n):
    return n * 2 if n % 2 == 0 else n

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    print(problem102a(n))