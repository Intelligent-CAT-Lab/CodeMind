import re

str = input()
print("A" if re.match(r"[A-Z]", str) else "a")