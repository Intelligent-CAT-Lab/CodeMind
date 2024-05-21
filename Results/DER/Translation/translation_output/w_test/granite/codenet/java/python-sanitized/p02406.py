x = int(input())
count = 0
a = 1
sb = []

if x >= 3 and x <= 10000:
    while count < x:
        b = a // 10
        if a % 3 == 0:
            sb.append(a)
        else:
            while b!= 0:
                if b % 10 == 3:
                    sb.append(a)
                    break
                b //= 10
        a += 1
        count += 1

print(" ".join(map(str, sb)))