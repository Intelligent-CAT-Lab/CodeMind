from math import factorial

fact = factorial(1510)
fact += 2

n = int(input())
print(fact)

for i in range(2, 2 + n):
    print(i)