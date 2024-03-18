# Read input from user
top = input()
cpp = False
score = 0

# Process the input string
for char in top:
    if cpp:
        if char == 'g':
            score += 1
        cpp = False
    else:
        if char == 'p':
            score -= 1
        cpp = True

# Print the score
print(score)