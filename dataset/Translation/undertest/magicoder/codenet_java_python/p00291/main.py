# Python code

# Read input
a = list(map(int, input().split()))

# Calculate the value
b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500

# Check if the value is greater than or equal to 1000
if b >= 1000:
    print("1")
else:
    print("0")