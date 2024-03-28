# Sample test case
s = input()

# Initialize variables
ans1 = 0
ans2 = 0

# Loop through each character in the string
for i in range(len(s)):
    c = s[i]

    # If the index is even, increment ans1 if c is 0, otherwise increment ans2
    if i % 2 == 0:
        if c == '0':
            ans1 += 1
        else:
            ans2 += 1
    # If the index is odd, increment ans1 if c is 1, otherwise increment ans2
    else:
        if c == '1':
            ans1 += 1
        else:
            ans2 += 1

# Print the minimum of ans1 and ans2
print(min(ans1, ans2))