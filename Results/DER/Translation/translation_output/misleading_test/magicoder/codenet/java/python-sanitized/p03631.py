# Python code

# Get input
a = int(input())

# Extract digits
a100 = a // 100
a10 = (a // 10) % 10
a1 = a % 10

# Reverse the number
rev = a1 * 100 + a10 * 10 + a100

# Check if the number is a palindrome
if a == rev:
    ans = "Ye"
else:
    ans = "No"

# Print the result
print(ans)