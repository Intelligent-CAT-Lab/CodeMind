def check_string(S):
    S = S.replace("eraser", "")
    S = S.replace("erase", "")
    S = S.replace("dreamer", "")
    S = S.replace("dream", "")
    if len(S) == 0:
        return "YES"
    else:
        return "NO"

# Test case
input_string = "erasedream"
print(check_string(input_string))