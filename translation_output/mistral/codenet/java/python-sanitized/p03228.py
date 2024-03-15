# Python implementation of the given Java code

a = int(input("Enter value of a: "))
b = int(input("Enter value of b: "))
op = int(input("Enter number of operations: "))

for i in range(op):
    if i % 2 == 0:
        b += a // 2
        a //= 2
    else:
        a += b // 2
        b //= 2

print(a)
print(b)