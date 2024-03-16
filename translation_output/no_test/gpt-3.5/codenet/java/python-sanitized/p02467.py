n = int(input())
print(f"{n}: ", end='')

i = 2
while n >= i * i:
    if n % i == 0:
        n = n // i
        print(f"{i} ", end='')
    else:
        i += 1

print(n)