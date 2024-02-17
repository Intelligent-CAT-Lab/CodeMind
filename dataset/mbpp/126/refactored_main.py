a = 10
b = 15
sum = 0
for i in range (1,min(a,b)): 
    if (a % i == 0 and b % i == 0): 
        sum += i 
print(sum)