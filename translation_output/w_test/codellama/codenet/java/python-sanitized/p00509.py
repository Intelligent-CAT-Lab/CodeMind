import sys

def main():
    n, c = map(int, sys.stdin.readline().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            for i in range(n * 2):
                print(9, end='')
            print()
    else:
        a = 1
        for i in range(n):
            a *= 10
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if check(i, c):
                return

def check(i, c):
    builder = str(i)
    builder2 = builder[::-1]
    builder += str(c) + builder2
    if prime(int(builder)):
        print(builder)
        return True
    else:
        return False

def prime(b):
    for i in range(2, int(b ** 0.5) + 1):
        if b % i == 0:
            return False
    return True

if __name__ == '__main__':
    main()