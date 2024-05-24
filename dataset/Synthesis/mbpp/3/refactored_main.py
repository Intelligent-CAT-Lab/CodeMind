import math
n = 2
result = False
for i in range(2,int(math.sqrt(n)) + 1):
    if n % i == 0:
        result = True
print(result)