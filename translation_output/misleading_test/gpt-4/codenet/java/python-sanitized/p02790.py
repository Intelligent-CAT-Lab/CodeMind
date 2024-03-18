# Obtain the user input
a, b = map(int, input().split())

# Depending on the condition, print the required digit the specified number of times
if a >= b:
    for i in range(a):
        print(b, end="")
else:
    for i in range(b):
        print(a, end="")

# End the output line
print()