import sys

for s in sys.stdin:
    s = s.rstrip()  # Remove trailing newline
    t = ""
    for c in s:
        if 'a' <= c <= 'z':  # Check if c is a lowercase letter
            t += chr(ord(c) - 32)
        else:
            t += c
    print(t)