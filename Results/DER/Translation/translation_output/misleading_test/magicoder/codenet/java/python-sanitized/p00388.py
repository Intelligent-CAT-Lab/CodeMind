# Python code

# importing the required module
import sys

# reading input from the user
H, A, B = map(int, sys.stdin.readline().split())

# initializing the answer variable
ans = 0

# looping through the range of A to B
for i in range(A, B+1):
    # checking if H is divisible by i
    if H % i == 0:
        # incrementing the answer variable
        ans += 1

# printing the answer
print(ans)