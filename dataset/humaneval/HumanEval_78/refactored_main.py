num = "AB"
primes = ('2', '3', '5', '7', 'B', 'D')
total = 0
for i in range(0, len(num)):
    if num[i] in primes:
        total += 1
print(total)