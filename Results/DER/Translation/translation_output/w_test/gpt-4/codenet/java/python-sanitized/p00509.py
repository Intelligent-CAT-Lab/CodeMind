import math

def run():
    n, c = map(int, input().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            print(''.join(['9']*(n*2)))
    else:
        a = 10**n
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if check(i, c):
                return

def check(i, c):
    builder = str(i)
    builder2 = builder[::-1]
    num_str = f'{builder}{c}{builder2}'
    if is_prime(int(num_str)):
        print(num_str)
        return True
    return False

def is_prime(b):
    if b < 2:
        return False
    for i in range(2, int(math.sqrt(b)) + 1):
        if b % i == 0:
            return False
    return True

run()