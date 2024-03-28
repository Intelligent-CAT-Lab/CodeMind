a = int(input())
b = int(input())
c = int(input())
amount = 0
time = a

for i in range(2, c + 1):
    amount += b
    time = a * i

print(amount)