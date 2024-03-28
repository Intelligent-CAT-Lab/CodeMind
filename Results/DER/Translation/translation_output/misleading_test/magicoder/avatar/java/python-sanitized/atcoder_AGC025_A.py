n = int(input())

if n % 10 != 0:
    print(n)
elif n % 100 == 0:
    print(10)
else:
    print(n // 10)