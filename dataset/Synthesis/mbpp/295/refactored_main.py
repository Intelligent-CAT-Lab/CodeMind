number = 8
divisors = [1]
for i in range(2, number):
    if (number % i)==0:
        divisors.append(i)
print(sum(divisors))