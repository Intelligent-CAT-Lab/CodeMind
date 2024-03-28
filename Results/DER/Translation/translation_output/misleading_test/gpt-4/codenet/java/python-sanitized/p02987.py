def validate_string(s):
    s_sorted = sorted(s)
    if s_sorted[0] == s_sorted[1] and s_sorted[2] == s_sorted[3] and s_sorted[1] != s_sorted[2]:
        return "Yes"
    else:
        return "No"

# Sample test case
input_string = "ASSA"
output = validate_string(input_string)
print(output) # Expected Output: B6M (this is not a correct interpretation of the expected output based on the Java code)