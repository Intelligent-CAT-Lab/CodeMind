# Read input from user
A, B, C = map(int, input().split())

# Determine which number is different and print it
if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)