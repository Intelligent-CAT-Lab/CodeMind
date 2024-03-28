def generate_3s_series(count):
    out = []
    a = 1
    while count > 0:
        b = a // 10
        if a % 3 == 0:
            out.append(a)
            count -= 1
        else:
            b = a
            while b != 0:
                if b % 10 == 3:
                    out.append(a)
                    count -= 1
                    break
                b //= 10
        a += 1
    return out

x = int(input())
if 3 <= x <= 10000:
    numbers = generate_3s_series(x)
    print(" ".join(map(str, numbers)))