# Read the input values
a, b = map(int, input().split())

# Check the conditions and print the result
if a + b == 15:
    print("+")
elif a * b == 15:
    print("*")
else:
    print("x")