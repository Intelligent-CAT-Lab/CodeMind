# Read the input from the user
r, d, x = map(int, input().split())

# Iterating over 10 years as per the Java code
for i in range(10):
    x = r * x - d
    print(x)