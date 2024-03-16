import sys

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def check(n, c):
    num = list(map(int, input().split()))
    num.sort()
    for i in range(len(num)):
        if num[i] == c:
            return True
    return False

def run():
    n, c = map(int, input().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            for i in range(n*2):
                print(9, end='')
            print()
    else:
        a = 1
        for i in range(n):
            a *= 10
        b = a // 10
        a -= b
        for i in range(b, a-1, -1):
            if check(i, c):
                return
    print(-1)

if __name__ == '__main__':
    run()