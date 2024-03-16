x = int(input())
count = 0
a = 1
b = 0
if x >= 3 and x <= 10000:
    for count in range(x):
        b = a // 10
        if a % 3 == 0:
            print(a)
        else:
            b = a
            while b != 0:
                if b % 10 == 3:
                    print(a)
                    break
                b //= 10
        a += 1