import re

str = input()
if re.match("[A-Z]", str):
    print("A")
else:
    print("a")