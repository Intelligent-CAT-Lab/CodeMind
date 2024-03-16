# Read input from the user
s1 = input()

ans = 0
c1 = 0
c0 = 0

# Iterate through the characters in the input string
for char in s1:
    if char == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:  # char == '0'
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

# Print the result multiplied by 2
print(ans * 2)