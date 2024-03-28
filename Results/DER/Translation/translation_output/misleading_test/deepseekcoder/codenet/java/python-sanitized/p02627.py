import re

def check_uppercase(s):
    if re.match("^[A-Z]*$", s):
        return "A"
    else:
        return "a"

print(check_uppercase(input()))