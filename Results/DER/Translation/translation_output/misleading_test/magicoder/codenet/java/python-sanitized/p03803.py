# Python code

# Read input from user
a, b = map(int, input().split())

# Check conditions and print output
if a == 1:
    if b != 1:
        print("Alice")
elif b == 1:
    if a != 1:
        print("Bob")
elif (a > b) and (a != 1) and (b != 1):
    print("Alice")
elif (a < b) and (a != 1) and (b != 1):
    print("Bob")
elif a == b:
    print("Draw")