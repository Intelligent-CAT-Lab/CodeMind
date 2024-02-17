n = 2
import math
fact = []
i = 2
while i <= int(math.sqrt(n) + 1):
    if n % i == 0:
        fact.append(i)
        n //= i
    else:
        i += 1

if n > 1:
    fact.append(n)
print(fact)