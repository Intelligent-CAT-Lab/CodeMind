n = int(input())
print(n, end=": ")
i = 2
while n >= i * i:
    if n % i == 0:
        n //= i
        print(i, end=" ")
    else:
        i += 1
print(n)