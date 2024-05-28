import re
str1 = "Python"
print(re.sub(r"(\w)([A-Z])", r"\1 \2", str1))