a = int(input())
b = int(input())
x = int(input())

count = b // x - a // x
if a % x == 0:
    count += 1

print(count)