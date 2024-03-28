import sys

def fibonacci(n):
    num = [0] * 100
    num[0] = 2
    num[1] = 1
    for i in range(2, n+1):
        num[i] = num[i-1] + num[i-2]
    return num[n]

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    print(fibonacci(n))