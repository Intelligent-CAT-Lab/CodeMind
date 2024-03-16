import sys

x = int(sys.stdin.readline())

if x >= 3 and x <= 10000:
    count = 0
    a = 1
    while count < x:
        b = a // 10
        if a % 3 == 0:
            print(a, end=" ")
        else:
            while b != 0:
                if b % 10 == 3:
                    print(a, end=" ")
                    break
                b //= 10
        a += 1
        count += 1