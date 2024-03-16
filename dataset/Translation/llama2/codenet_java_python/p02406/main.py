import sys

x = int(sys.stdin.readline())

sb = ""
count = 0
a = 1
b = 0

if x >= 3 and x <= 10000:
    for _ in range(x):
        b = a / 10
        if a % 3 == 0:
            sb += " "
            sb += str(a)
        else:
            b = a
            while b != 0:
                if b % 10 == 3:
                    sb += " "
                    sb += str(a)
                    break
                b //= 10
        a += 1

print(sb)