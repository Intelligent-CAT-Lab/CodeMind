import sys

def convert_to_uppercase(s):
    t = ""
    for c in s:
        if 97 <= ord(c) <= 123:
            t += chr(ord(c) - 32)
        else:
            t += c
    return t

for line in sys.stdin:
    print(convert_to_uppercase(line.strip()))