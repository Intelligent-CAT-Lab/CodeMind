n = int("1900")
if n % 1000 == 0:
    print(0)
else:
    print(1000 - n % 1000)