# Sample test case
a = 5
b = 4
op = 2

# Expected output
print(a)
print(b)

# Python code
a = int(input())
b = int(input())
op = int(input())

for i in range(op):
    if i % 2 == 0:
        b += a // 2
        a //= 2
    else:
        a += b // 2
        b //= 2

print(a)
print(b)