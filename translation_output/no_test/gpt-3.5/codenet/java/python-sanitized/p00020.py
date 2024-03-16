import sys

for line in sys.stdin:
    s = line.strip()
    t = ""
    for c in s:
        t += chr(ord(c) - 32) if ord(c) >= 97 and ord(c) <= 123 else c
    print(t)