# Take input from user
S = input()

# Use a list comprehension to replace '1's with '9's and '9's with '1's
result = ''.join(['9' if c == '1' else '1' for c in S[:3]]) + S[3:]

# Print the result
print(result)