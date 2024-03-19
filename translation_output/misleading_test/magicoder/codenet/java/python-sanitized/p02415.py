# Python code

def convert_case(s):
    result = ""
    for char in s:
        if char.islower():
            result += char.upper()
        elif char.isupper():
            result += char.lower()
        else:
            result += char
    return result

# Test input
test_input = "FAIR, LATER, OCCASIONALLY CLOUDY."

# Call the function with the test input
print(convert_case(test_input))