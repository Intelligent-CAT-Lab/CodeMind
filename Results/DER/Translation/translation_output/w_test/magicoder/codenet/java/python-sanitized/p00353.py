# Python code

# Read input from user
m, f, b = map(int, input().split())

# Check if the total number of students is less than the number of books
if b > m + f:
    print("NA")
elif b > m:
    print(b - m)
else:
    print("0")