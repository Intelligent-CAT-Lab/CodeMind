import re

def internationalization(s):
    return re.sub(r'^.|.$', '.', s)

print(internationalization('internationalization'))