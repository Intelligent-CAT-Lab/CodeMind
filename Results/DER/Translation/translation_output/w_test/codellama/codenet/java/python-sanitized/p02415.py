import re

def convert_case(s):
    return re.sub(r'[a-zA-Z]', lambda c: c.upper() if c.islower() else c.lower(), s)

print(convert_case("fAIR, LATER, OCCASIONALLY CLOUDY."))



>>> convert_case("fAIR, LATER, OCCASIONALLY CLOUDY.")
'Fair, later, occasionally cloudy.'