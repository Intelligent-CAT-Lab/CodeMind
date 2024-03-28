# Python code

# Get input from user
a, b, c = map(int, input().split())

# Convert integers to strings
StringA = str(a)
StringB = str(b)
StringC = str(c)

# Check conditions and print result
if a >= b and a >= c:
    if b >= c:
        print(int(StringA + StringB) + c)
    else:
        print(int(StringA + StringC) + b)
elif b >= a and b >= c:
    if a >= c:
        print(int(StringB + StringA) + c)
    else:
        print(int(StringB + StringC) + a)
else:
    if a >= b:
        print(int(StringC + StringA) + b)
    else:
        print(int(StringC + StringB) + a)