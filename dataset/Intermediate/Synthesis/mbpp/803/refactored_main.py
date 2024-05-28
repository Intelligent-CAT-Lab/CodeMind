n = 10
i = 1
while (i * i<= n):
    if ((n % i == 0) and (n / i == i)):
        print(True)
        break
    i = i + 1
print(False)