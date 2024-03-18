# Taking input from the user
n = int(input())

# Checking if the number is a power of two
if (n & (n - 1)) == 0:
    print("YES")
else:
    print("NO")