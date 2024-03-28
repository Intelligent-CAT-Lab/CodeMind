import sys

def run():
    n, c = map(int, sys.stdin.readline().split())
    num = [0]*n
    if c < 0:
        if n == 1:
            print(11)
        else:
            print('9'* (n * 2))
    else:
        a = 10**n
        b = a // 10
        a -= 1
        for i in range(a, b-1, -1):
            if check(i, c):
                return

def check(i, c):
    s = str(i)
    s_rev = s[::-1]
    num = int(s + str(c) + s_rev)
    if prime(num):
        print(num)
        return True
    return False

def prime(n):
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

run()