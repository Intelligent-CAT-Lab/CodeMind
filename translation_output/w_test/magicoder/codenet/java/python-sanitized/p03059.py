# Python code

# Read input from user
a, b, c = map(int, input().split())

amount = 0
time = a

for i in range(2, c + 1):
    amount += b
    time = a * i

print(amount)