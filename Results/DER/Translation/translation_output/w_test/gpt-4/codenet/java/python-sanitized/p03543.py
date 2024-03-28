# Read input from user
n = int(input())

# Extract digits
n1 = n % 10
n10 = (n // 10) % 10
n100 = (n // 100) % 10
n1000 = n // 1000

# Check if any three digits are the same
if (n1 == n10 == n100) or (n10 == n100 == n1000):
    print("Yes")
else:
    print("No")