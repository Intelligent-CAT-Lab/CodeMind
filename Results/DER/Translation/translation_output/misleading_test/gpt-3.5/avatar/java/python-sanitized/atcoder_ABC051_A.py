import re

input_str = input()
a, b, c = re.split(',', input_str)

print(a.strip() + " " + b.strip() + " " + c.strip())