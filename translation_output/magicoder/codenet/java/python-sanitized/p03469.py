# Python code

# importing the required module
import sys

# reading input from user
S = sys.stdin.readline().strip()

# printing 2018
print(2018)

# printing the rest of the string
for i in range(4, len(S)):
    print(S[i], end='')