# Read input string
S = input()

# Replace the pattern with '-'
S = S.replace("eraser", "-")
S = S.replace("erase", "-")
S = S.replace("dreamer", "-")
S = S.replace("dream", "-")

# Replace '-' with blank
S = S.replace("-", "")

# Check if the string is empty
if len(S) == 0:
    print("YES")
else:
    print("NO")

# Test case
if __name__ == "__main__":
    assert('erasedream'.replace("eraser", "-").replace("erase", "-").replace("dreamer", "-").replace("dream", "-").replace("-", "") == "")