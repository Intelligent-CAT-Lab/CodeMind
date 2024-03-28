def calc(num):
    n = float(num)
    sum_val = 0
    while num != 0:
        sum_val += num % 10
        num //= 10
    return n / sum_val

K = int(input())
num = 0
d = 1
for i in range(K):
    num += d
    if calc(num + 2 * d) < calc(num + d):
        d *= 10
    print(num)