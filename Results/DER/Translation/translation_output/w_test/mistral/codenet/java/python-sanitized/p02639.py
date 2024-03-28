# Sample test case
x = [0, 2, 3, 4, 5]

# Expected output
print(15 - sum(x))

# Python code
sum = 0
for i in range(len(x)):
    sum += x[i]
print(15 - sum)