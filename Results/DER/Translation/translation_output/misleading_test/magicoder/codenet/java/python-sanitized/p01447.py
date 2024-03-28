n = int(input())
count = 0

while n > 1:
    if n % 3 == 0:
        n = n // 3
    else:
        n = (n + 3 - n % 3) // 3
    count += 1

print(count)