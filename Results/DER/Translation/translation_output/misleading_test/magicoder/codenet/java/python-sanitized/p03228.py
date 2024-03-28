# Python code

# importing the required module
import sys

# reading input from the user
a, b, op = map(int, sys.stdin.readline().split())

# performing the operations
for i in range(op):
    if i % 2 == 0:
        b += a // 2
        a //= 2
    else:
        a += b // 2
        b //= 2

# printing the result
print(a)