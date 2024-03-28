import sys

def fib(n):
    if n == 0 or n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    print(fib(n))