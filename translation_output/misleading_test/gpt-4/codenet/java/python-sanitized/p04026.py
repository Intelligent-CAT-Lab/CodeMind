# Read input
s = input()

# Initialize array to store the last occurrence of each character
last = [-1] * 26

# Iterate through the characters in the input string
for i, char in enumerate(s):
    ch = ord(char) - ord('a')
    # Check if the character has occurred before with distance less than 3
    if last[ch] >= 0 and i - last[ch] < 3:
        # Output the indices (1-indexed)
        print(last[ch] + 1, i + 1)
        break
    last[ch] = i
else:
    # If no such characters are found
    print("-1 -1")

# Sample Test Case
# Input: "needed"
# Output: "2 5"