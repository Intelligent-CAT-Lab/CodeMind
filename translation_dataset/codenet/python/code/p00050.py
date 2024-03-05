import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))
