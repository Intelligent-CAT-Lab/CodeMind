import re

pattern = re.compile(r'A?KIH?B?R?A?')

s = input()
if pattern.fullmatch(s):
    print("YES")
else:
    print("NO")