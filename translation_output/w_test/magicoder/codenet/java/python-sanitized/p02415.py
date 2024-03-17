#8-A

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
s = "fAIR, LATER, OCCASIONALLY CLOUDY."

# Call the function
print(convert_case(s))