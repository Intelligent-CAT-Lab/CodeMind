def check_palindrome(s):
    for i in range(len(s) // 2):
        if s[i] != s[-1 - i]:
            return "No"
    for i in range(len(s) // 2 - 1):
        if s[i] != s[(len(s) // 2) - 1 - i]:
            return "No"
    return "Yes"

# Sample test case
input_string = "akasaka"
output = check_palindrome(input_string)
print(output)