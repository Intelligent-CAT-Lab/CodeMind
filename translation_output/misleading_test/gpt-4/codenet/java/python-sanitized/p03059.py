# Read input from the user
a, b, c = map(int, input().split())
amount = 0 
time = a

# Calculating the amount
for i in range(2, int((c + 0.5) / a) + 1):
    amount += b
    time = a * i

# Printing the result
print(amount)