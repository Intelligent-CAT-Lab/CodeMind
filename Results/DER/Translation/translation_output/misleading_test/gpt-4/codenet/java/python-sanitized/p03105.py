# Getting the input from user and splitting by space
A, B, C = map(int, input().split())

# Calculating the value of N
N = B // A

# Printing the result based on the condition
if N > C:
    print(C)
else:
    print(N)