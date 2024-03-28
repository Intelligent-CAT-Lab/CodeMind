import re

def is_hihi(s):
    if len(s) % 2 == 1:
        return "No"
    else:
        pattern = re.compile(r"hi")
        matches = pattern.finditer(s)
        for match in matches:
            if match.start() % 2 == 1:
                return "No"
        return "Yes"

print(is_hihi("hihi"))