import sys

x = int(input())
count = 0
a = 1
sb = []

if 3 <= x <= 10000:
    while count < x:
        b = a // 10
        if a % 3 == 0:
            sb.append(" ")
            sb.append(str(a))
        else:
            b = a
            while b != 0:
                if b % 10 == 3:
                    sb.append(" ")
                    sb.append(str(a))
                    break
                b //= 10
        a += 1
        count += 1

print("".join(sb))