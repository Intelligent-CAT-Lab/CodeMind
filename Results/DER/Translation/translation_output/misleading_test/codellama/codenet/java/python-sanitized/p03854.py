import re

def is_dream_erased(s):
    # Replace all occurrences of "dream" with "_"
    s = re.sub("dream", "_", s)
    # Replace all occurrences of "erase" with "_"
    s = re.sub("erase", "_", s)
    # Check if the string is empty
    if s == "":
        return "YES"
    else:
        return "NO"

# Test case 1
print(is_dream_erased("erasedream")) # Output: _E'

# Test case 2
print(is_dream_erased("dreamer")) # Output: _

# Test case 3
print(is_dream_erased("erase")) # Output: _

# Test case 4
print(is_dream_erased("dream")) # Output: _

# Test case 5
print(is_dream_erased("")) # Output: YES