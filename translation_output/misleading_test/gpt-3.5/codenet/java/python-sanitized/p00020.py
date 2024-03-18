import sys

for line in sys.stdin:
    t = ""
    for c in line:
        t += chr(ord(c) - 32) if 97 <= ord(c) <= 122 else c
    print(t)