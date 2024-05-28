num1 = 36
num2 = 57

total1 = 1
i = 2

while i * i <= num1:
    if (num1 % i == 0):
        total1 = (total1 + i + math.floor(num1 / i))
    i += 1


total2 = 1
i = 2

while i * i <= num2:
    if (num2 % i == 0):
        total2 = (total2 + i + math.floor(num2 / i))
    i += 1  

print(total1 == total2)