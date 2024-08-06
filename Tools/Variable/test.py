import re

text = "{'list': [6, 4, 2, 8, 15], 'operation': <function object at 0x7f269a926700>}"
pattern = r'<([^<>]+)>'
matches = re.findall(pattern, text)
print(matches)
