# Sample test case
s1 = input()

# Expected output
ans = 0

# Initialize counters
c1 = 0
c0 = 0

# Iterate through the string
for i in range(len(s1)):
    # If current character is '1', decrement c0 and increment ans
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    # If current character is '0', increment c1 and decrement ans
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

# Print the final answer
print(ans * 2)