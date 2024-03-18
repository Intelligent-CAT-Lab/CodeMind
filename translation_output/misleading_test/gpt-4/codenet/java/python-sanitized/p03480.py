# Read input from the user
s = input().strip()

# Append '2' to the string
s += '2'

# Calculate the length of the string and initialize the answer
n = len(s)
ans = n - 1

# Loop through the characters of the string
for i in range(n - 1):
    if s[i] != s[i + 1]:
        tmp = max(i + 1, n - i - 2)
        ans = min(ans, tmp)

# Print the result
print(ans)