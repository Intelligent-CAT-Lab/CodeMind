def count_ones(n):
    s = ""
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    return s.count('1')

n = int(input())
print(count_ones(n))