# Get input from the user
s = input()
c = 0

# Calculate the sum of the digits
for char in s:
    c += int(char)

# Check if the sum of digits is divisible by 9
if c % 9 == 0:
    print("Yes#")
else:
    print("No#")

# Sample Test Case
test_input = "123456789"
print("Test Input:", test_input)
print("Expected Output: Yes#")