import sys

def sum_digits(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n //= 10
    return sum

n = int(sys.stdin.readline().strip())
a = sum_digits(n)
if n % a == 0:
    print("Yes")
else:
    print("No")